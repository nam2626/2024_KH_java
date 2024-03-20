package e01_abstract;

/*
 * 	추상 클래스(Abstract Class)
 * 		- 직접적으로 생성이 되지 않는 클래스
 * 		- 자식 클래스가 생성이 될 때만 간접적으로 생성된다.
 * 		- class 키워드 앞에 abstract가 붙음
 * 		- 일반적으로는 최상위 클래스로 존재(최초에 클래스의 구조를 잡는 용도로 사용)
 * 
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal 생성자");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	//추상 메서드를 만들려면 반드시 추상 클래스에서만 작성이 가능함
	public abstract void run();//추상 메서드
	
}
