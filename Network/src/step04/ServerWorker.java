package step04;

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
		try(BufferedReader br = new BufferedReader(
						new InputStreamReader(client.getInputStream()));){
			while(true) {
				String msg = br.readLine();
				if(msg.equals("exit")) break;
				MultiEchoServerMain.broadCasting(client.getInetAddress() + "님의 메세지 : " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(client.getInetAddress() + "님이 접속 종료하였습니다.");
		MultiEchoServerMain.list.remove(this);
		System.out.println("현재 접속 중인 인원수는 " + MultiEchoServerMain.list.size() +"명 입니다.");
		
	}

	public void sendMessage(String message) {
		try(PrintWriter pw = new PrintWriter(client.getOutputStream(),true);){
			pw.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










