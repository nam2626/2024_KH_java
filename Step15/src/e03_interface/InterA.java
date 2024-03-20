package e03_interface;
/*
 * 	인터페이스(Interface)
 * 		클래스 대용품
 * 		기능을 기준으로 묶기위해 나왔음
 * 		메모리가 직접적으로 할당되지 않음
 * 		전역상수, 추상메서드, 디폴트 메서드
 * 		인터페이스들 끼리도 상속 및 다중 상속을 할 수 있음 
 */
public interface InterA {
//	public static final 안써도 자동으로 붙음
	public static final double PI = 3.1415;
//	public abstract 자동으로 붙음
	public void interA();
	
	//디폴트 메서드 ==> jdk8 버전부터 지원
	default double circleArea(double r) {
		return r * r * PI;
	}
}











