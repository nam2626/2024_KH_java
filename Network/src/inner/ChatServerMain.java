package inner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	// 사용자와의 통신을 담당할 스레드를 저장
	public static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public static void main(String[] args) {
		// 1. 서버 오픈
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("서버가 오픈되었습니다. 클라이언트 접속 대기중....");

			while (true) {
				// 2. 클라이언트 접속을 받음
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + " 클라이언트가 접속하였습니다.");

				// 3. 스레드 생성 및 실행
				ServerWorker sw = new ServerWorker(client);
				sw.start();
				list.add(sw);
				System.out.println("현재 접속 중인 인원수는 " + list.size() + "명 입니다.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 프로그램 종료");
	}

	private static class ServerWorker extends Thread {
		private Socket client;
		private PrintWriter pw;

		public ServerWorker(Socket client) {
			this.client = client;
			try {
				pw = new PrintWriter(client.getOutputStream(), true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			// 스레드가 할일은 사용자로부터 데이터를 받고, 다시 전송하는 일
			// 1. 입출력 스트림 초기화
			try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));) {
				while (true) {
					String msg = br.readLine();
					if (msg.equals("exit"))
						break;
					list.forEach(t -> t.sendMessage(client.getInetAddress() + "님의 메세지 : " + msg));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(client.getInetAddress() + "님이 접속 종료하였습니다.");
			list.remove(this);
			System.out.println("현재 접속 중인 인원수는 " + list.size() + "명 입니다.");

		}

		public void sendMessage(String message) {
			pw.println(message);
		}
	}

}
