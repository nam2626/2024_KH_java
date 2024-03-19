package e02_collection;

import java.util.HashSet;

public class ObjSetExample {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		
		//set에 Person 데이터 5건 저장, 그중에 한건은 동일한 데이터를 저장
		set.add(new Person("김철수", 20));
		set.add(new Person("이철수", 20));
		set.add(new Person("박철수", 20));
		set.add(new Person("곽철수", 20));
		set.add(new Person("정철수", 20));
		set.add(new Person("김철수", 20));
		
		System.out.println(set);
	}

}






