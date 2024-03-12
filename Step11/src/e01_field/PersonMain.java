package e01_field;

public class PersonMain {

	public static void main(String[] args) {
		//new -> 메모리 할당, 생성된 Person 객체(instance)
		Person p1 = new Person();
		System.out.println(p1.name + " " + p1.age);
		p1.name = "홍길동";
		p1.age = 20;
		System.out.println(p1.name + " " + p1.age);
		
		//Person 생성, 데이터 저장, 출력
		Person p2 = new Person();
		p2.name = "김철수";
		p2.age = 10;
		System.out.println(p2.name + " " + p2.age);
		
	}

}






