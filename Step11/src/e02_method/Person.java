package e02_method;

public class Person {
	String name;
	int age;
	
	//Person의 정보를 출력하는 메서드
	//출력 형태 --> 이름 나이
	void printPersonInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	//데이터를 받아서 초기화하는 메서드
	void init(String n, int a) {
		if(!n.equals("") || n != null)
			name = n;
		else
			name = "임시값";
		
		if(a > 0)
			age = a;
	}
}








