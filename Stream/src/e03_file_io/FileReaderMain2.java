package e03_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain2 {

	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("hello.txt");
			 BufferedReader br = new BufferedReader(fr);){

			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
