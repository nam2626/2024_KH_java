package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		// 1. 서버 접속
		// 2. 스트림 초기화
		try (Socket server = new Socket("127.0.0.1", 1234);
			PrintWriter pw = new PrintWriter(server.getOutputStream(),true);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()));
				Scanner sc = new Scanner(System.in);
				) {
			while(true) {
				// 3. 데이터 입출력 처리
				// 3-1. 사용자에게 데이터 입력을 받음 
				System.out.print("데이터 입력 : ");
				String msg = sc.nextLine();
				// 3-2. 서버로 데이터 전송
				pw.println(msg);
				if(msg.equals("exit")) break;
				// 3-3. 서버가 보낸 데이터 받음
				String message = br.readLine();
				System.out.println(message);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 프로그램 종료");
	}

}




