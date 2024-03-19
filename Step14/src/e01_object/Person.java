package e01_object;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		//객체 비교 - Object로 받아오는 이유는 모든 클래스의 최상위 클래스이기 때문에
		//			어떤 객체라도 받을 수 있다.
		//1. 메모리 주소가 같으면, 같은 객체
		if(this == obj) return true;
		//2. 받아온 obj가 현재 객체랑 비교할 수 있는 타입인지 확인
		//	instanceof, getClass()를 활용해서 
		//	객체가 가지고 클래스 정보로 패키지명.클래스명이 동일한지 확인
		if(obj instanceof Person) {
			//3. 받아온 객체를 형변환
			Person temp = (Person) obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}
	
	
}





