package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker extends Thread{
	private Socket client;

	public ServerWorker(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		//스레드가 할일은 사용자로부터 데이터를 받고, 다시 전송하는 일
		//1. 입출력 스트림 초기화
		try(PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
				BufferedReader br = new BufferedReader(
						new InputStreamReader(client.getInputStream()));){
			while(true) {
				//2. 데이터 입출력
				//2-1. 사용자 보낸 데이터를 받음
				String msg = br.readLine();
				//2-2. 사용자가 보낸 내용이 exit면 프로그램 종료
				if(msg.equals("exit")) break;
				//2-3. 사용자에게 받은 데이터를 그대로 전송
				pw.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(client.getInetAddress() + "님이 접속 종료하였습니다.");
	}
	
}



