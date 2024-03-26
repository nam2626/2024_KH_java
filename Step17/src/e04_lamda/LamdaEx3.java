package e04_lamda;

public class LamdaEx3 {
	public static <T> void run(Method<T> m, T val) {
		m.run(val);
	}
	
	public static void main(String[] args) {
		Method<String> m1 = (a) -> System.out.println(a);
		m1.run("Hello");
		//정수 - 제곱의 결과를 출력
		Method<Integer> m2 = a -> System.out.println(a*a);
		m2.run(3);
		//실수 - 원넓이 결과를 출력
		Method<Double> m3 = a -> System.out.println(a * a * Math.PI);
		m3.run(4.0);
		
		run(m1, "안녕");
		run(m2, 4);
		run(m3, 3.5);
		
	}
 
}
