package e03_super;

public class Person extends Animal{
	private String name;

	//자식 생성자가 부모 생성자에 필요한 값을 받아서
	//부모 생성자에게 전달함 ---> super(값....) : 부모 생성자를 호출하는 부분
	//자식 생성자가 제일 먼저 해야되는 일이, 부모 생성자를 호출하는 부분
	public Person(int age, String name) {
//		this.name = name; //부모 생성자 호출전에 코드가 있으면 안됨
		super(age);//부모 생성자 호출하는 부분
		this.name = name;
	}
	
	@Override
	public void printAge() {
		System.out.println("이사람의 이름 : "  + name);
		super.printAge();
	}
	
}
