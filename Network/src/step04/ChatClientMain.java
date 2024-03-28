package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
 
public class ChatClientMain {
	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1",1234); 
				Scanner sc = new Scanner(System.in);) {
			System.out.println("서버 접속 완료");
			//-----------------------------------
			Thread t = new Thread(() -> {
				try(BufferedReader br = new BufferedReader(
						new InputStreamReader(server.getInputStream()))){
					while(true) {
						String msg = br.readLine();
						if(msg.equals("exit")) break;
						System.out.println(msg);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			t.start();
			//-----------------------------------
			PrintWriter pw = new PrintWriter(server.getOutputStream(), true);

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
