package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

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
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 프로그램 종료");
	}

}
