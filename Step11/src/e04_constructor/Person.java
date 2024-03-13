package e04_constructor;

public class Person {
	private String name;
	private int age;
	
	/*
	 * 		생성자(constructor)
	 * 			생성자는 객체가 하나 생성 될때 제일 먼저 실행되는 메서드
	 * 			만약에 생성자를 직접 작성하지 않으면,
	 * 			자바 컴파일러가 자동으로 아무런 일도 안하는 기본 생성자를 추가
	 * 			Person(){		}
	 * 			1. 리턴 타입이 없음.
	 * 			2. 메서드명이 클래스명과 같음
	 */
	//기본 생성자
	public Person() {
		System.out.println("Person 기본 생성자");
	}
	
	public Person(String n) {
		System.out.println("Person(String) 생성자");
		name = n; 
	}
	
	//이름 나이를 받아서 초기화하는 생성자
	public Person(String n ,int a) {
		System.out.println("Person(String, int) 생성자");
		name = n;
		age = a;
	}
	
	public void printPersonInfo() {
		System.out.println(name + " " + age);
	}
	
}



