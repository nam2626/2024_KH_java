
public class E04_Math {

	public static void main(String[] args) {
		//절대값
		System.out.println(Math.abs(-100));
		//올림
		System.out.println(Math.ceil(3.4));//4
		System.out.println(Math.ceil(-3.4));//-3
		//내림
		System.out.println(Math.floor(3.4)); //3
		System.out.println(Math.floor(-3.4));//-4
		//반올림
		System.out.println(Math.round(3.4));//3
		System.out.println(Math.round(-3.4));//-3
		//큰 값, 작은 값
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		//삼각함수, 사인, 코사인, 탄젠트 각각 40도에 해당하는 결과를 출력
		System.out.println(Math.sin(Math.toRadians(40)));
		System.out.println(Math.cos(Math.toRadians(40)));
		System.out.println(Math.tan(Math.toRadians(40)));
		
		//pi
		System.out.println(Math.PI);
		
		//랜덤
		System.out.println(Math.random());
	}

}







