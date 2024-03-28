package step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(1234); Scanner sc = new Scanner(System.in);) {
			System.out.println("서버가 오픈되었습니다. 클라이언트 접속 대기중....");
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " 클라이언트가 접속하였습니다.");

			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);

			while (true) {
				System.out.println("메세지 입력 : ");
				String msg = sc.nextLine();
				pw.println(msg);

				if (msg.equals("exit"))
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
