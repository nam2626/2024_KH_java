package e03_exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			int[] arr = new int[5];
			arr[0] = 10;
			arr[1] = arr[0] / 2;
			arr[5] = arr[1] * 3;
			System.out.println(2);
		} catch (NullPointerException  e) {
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println(5);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			//모든 Exception 클래스들의 부모 클래스라서 모든 종류의 Exception 객체를 받을수 있음
			System.out.println(7);
		}
		System.out.println(8);
	}

}






