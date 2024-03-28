package step04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiEchoServerMain {
	//사용자와의 통신을 담당할 스레드를 저장
	public static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public static void main(String[] args) {
		//1. 서버 오픈
		try(ServerSocket server = new ServerSocket(1234);){
			System.out.println("서버가 오픈되었습니다. 클라이언트 접속 대기중....");

			while(true) {
				//2. 클라이언트 접속을 받음
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + " 클라이언트가 접속하였습니다.");
				
				//3. 스레드 생성 및 실행
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

}
