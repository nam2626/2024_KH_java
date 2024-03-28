package e03_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// 1. 복사할 원본 파일(A)을 스트림으로 연결 --> FileInputStream
		// 2. 복사할 곳 파일(B)을 스트림으로 연결 --> FileOutputStream
		// 3. A에서 데이터를 읽어오고, B에다가 출력 --> 3번 과정을 반복해서 끝나면 파일복사가 완료된 시점
		try (FileInputStream fis = new FileInputStream("c:\\test\\moon.jpg");
				FileOutputStream fos = new FileOutputStream("c:\\test\\new_moon.jpg");) {
			byte[] buffer = new byte[1024];
			long startTime = System.currentTimeMillis();
			while (true) {
				int n = fis.read(buffer);
				if (n == -1)
					break;
				fos.write(buffer,0,n);
			}
			fos.flush();
			long endTime = System.currentTimeMillis();
			System.out.println("완료 시간 : " + (endTime - startTime));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
