package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		// 1. 서버 접속
		// 2. 스트림 초기화
		try (Socket server = new Socket("127.0.0.1", 1234);
			PrintWriter pw = new PrintWriter(server.getOutputStream(),true);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()));
				) {
			// 3. 데이터 입출력 처리
			// 3-1. 서버로 데이터 전송
			pw.println("안녕");
			// 3-2. 서버가 보낸 데이터 받음
			String msg = br.readLine();
			System.out.println(msg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
