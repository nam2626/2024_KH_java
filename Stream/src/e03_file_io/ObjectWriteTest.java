package e03_file_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectWriteTest {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("김씨", 20));
		list.add(new Person("이씨", 12));
		list.add(new Person("박씨", 22));
		list.add(new Person("곽씨", 45));
		list.add(new Person("정씨", 32));
		
		try(FileOutputStream fos = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				){
			
			for (Person person : list) 
				oos.writeObject(person);
			
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}





