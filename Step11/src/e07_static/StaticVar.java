package e07_static;

public class StaticVar {
	public static int n1 = 10;
	public static final double PI = 3.1415;
	public int n2 = 20;
	
	public static void main(String[] args) {
		//static 키워드가 붙어있으면 미리 메모리가 할되어있기 때문에 접근이 가능함
		System.out.println(n1);
		System.out.println(PI);
		//n2는 StaticVar 클래스의 필드이기 때운에 아직 생성되지 않음.
		//그래서 static은 non-static에 접근할 수 없다.
//		System.out.println(n2);
		//non-static은 반드시 생성 후에 실행
		StaticVar var = new StaticVar();
		System.out.println(var.n2);
		
		//static으로 선언된 변수나 상수, 메서드에 접근하는 방법
		//클래스명.변수명, 클래스명.상수명, 클래스명.메서드()
		//객체명.변수명, 객체명.상수명, 객체명.메서드()
		System.out.println(StaticVar.n1);
		System.out.println(StaticVar.PI);
		System.out.println(var.n1);
		System.out.println(var.PI);
		System.out.println(Math.PI);
	}

}






