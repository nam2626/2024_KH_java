package e03_access;
/*
 * 		접근 제어자
 * 			변수와 메서드를 접근할 수 있는 범위를 설정하는 옵션
 * 
 * 			private : 해당 클래스 내에서만 접근이 가능(외부에서 접근 X)
 * 			protected : 해당 클래스를 상속 받은 자식(자손들까지 가능) 클래스들까지 접근이 가능
 * 			default : 접근 제어자를 사용 안했을때 자동으로 붙음, 같은 패키지 내에 있는 클래스들까지 접근이 가능
 * 			public : 누구든지 접근이 가능
 * 
 */
public class Person {
	String name;
	private int age;
	
	void printPersonInfo() {
		System.out.println(name + " " + age);
	}
	
	//나이를 저장하는 메서드 - 나이는 0보다 큰값만 저장되게끔 처리
	public void setAge(int a) {
		if(a > 0)
			age = a;
	}
	//나이를 외부로 반환하는 메서드
	public int getAge() {
		return age;
	}
}




