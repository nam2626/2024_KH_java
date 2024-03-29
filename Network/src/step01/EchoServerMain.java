package step01;

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
			//2. 클라이언트 접속을 받음
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " 클라이언트가 접속하였습니다.");
			//3. 입출력 스트림 초기화
			PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));

			while(true) {
				//4. 데이터 입출력
				//4-1. 사용자 보낸 데이터를 받음
				String msg = br.readLine();
				//4-2. 사용자가 보낸 내용이 exit면 프로그램 종료
				if(msg.equals("exit")) break;
				//4-3. 사용자에게 받은 데이터를 그대로 전송
				pw.println(msg);
			}
			
			//5. 닫기
			br.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 프로그램 종료");
	}

}
