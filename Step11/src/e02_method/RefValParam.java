package e02_method;

public class RefValParam {
	//Call by Reference - 참조에 의한 호출 --> 메모리 주소값이 전달
	//	메모리 주소가 전달되기 때운에 다른 메서드에서 수정작업을 하면 원본에 내용이 바뀐다.
	//	주로 참조형 변수타입에서 발생한다.(String, 클래스 타입...)
	public static void addNumber(Number n) {
		n.setNum(n.getNum()+1);
	}
	//Call by Value - 값에 의한 호출 --> 값을 복사해서 보냄
	//	매개변수와 호출하는 변수와는 별개, 메서드에서 수정 작업을 해도 원본에는 영향을 미치지 않는다.
	//	주로 기본형 변수 타입에서 발생한다.(int, float, char, double.....)
	public static void minusNumber(int n) {
		n--;
	}
	
	public static void main(String[] args) {
		Number num = new Number(10);
		
		System.out.println(num.getNum());
		addNumber(num);
		System.out.println(num.getNum());
		
		int n = 10;
		System.out.println(n);
		minusNumber(n);
		System.out.println(n);
	}

}
