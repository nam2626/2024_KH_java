package e03_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadHex {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("data.dat");){
			int data = 0;
			
			while(true) {
				data = fis.read();
				if(data == -1) break;
				System.out.print(Integer.toHexString(data) + " ");
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
