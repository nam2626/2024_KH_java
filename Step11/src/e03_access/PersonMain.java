package e03_access;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-1);
//		System.out.println(p.age);//age가 private으로 지정되면서 외부에서는 접근이 불가능
		p.setAge(12);
//		p.age = -12;
		System.out.println(p.getAge());
	}

}
