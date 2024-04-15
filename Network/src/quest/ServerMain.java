package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(1234);){
			System.out.println("서버가 오픈되었습니다. 클라이언트 접속 대기중....");
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " 클라이언트가 접속하였습니다.");

			PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));

			String msg = br.readLine();
			double r = Double.parseDouble(msg);
			double area = circleArea(r);
			
			pw.println(String.valueOf(area));
//			pw.println(area + "");

			br.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static double circleArea(double r) {
		return r * r * Math.PI;
	}

}




