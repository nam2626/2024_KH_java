package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1", 1234);
			Scanner sc = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(server.getOutputStream(),true);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()));
				) {
			System.out.print("반지름 입력 : ");
			double r = sc.nextDouble();
			pw.println(r);

			String msg = br.readLine();
			System.out.println("원넓이 : " + msg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
