package e03_file_io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectReadTest {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		try(FileInputStream fis = new FileInputStream("person.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);	){
			
			//파일에서 모든 객체를 받아와서 리스트에 저장
			try {
				while(true) {
					list.add((Person)ois.readObject());
				}
			}catch (EOFException e) {
				System.out.println("파일 읽기 완료");
			}
			System.out.println(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}




