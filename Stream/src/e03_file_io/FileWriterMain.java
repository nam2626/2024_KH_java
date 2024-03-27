package e03_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			//1. 노드 스트림 생성 및 초기화
			fw = new FileWriter("hello.txt", true);
			//2. 프로세스 스트림 생성 및 초기화
			pw = new PrintWriter(fw);
			//3. 출력
			pw.append("안녕");
			pw.println("Hello World");
			pw.println("안녕하세요?");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4. 닫기
			if(pw != null)	pw.close();
		}
		
	}

}

