package e07_static;

public class Count {
	private int count;
	private static int totalCount = 0;
	
	public Count() {
		count++;
		totalCount++;
		System.out.println(count + " " + totalCount);
	}
	
	public void addStaticCount() {
		//non-static에서는 static에 언제든지 접근이 가능
		//non-static이 실행되는 시점에는 static이 이미 메모리에 생성되어있다.
		//static으로 선언된 변수나, 메서드는 1개이기 때문에 대상이 누군지 특정이 가능하다.
		totalCount++;
		System.out.println(totalCount);
	}
	
	public static void addFieldCount() {
		//static은 non-static에 접근이 불가능
		//static이 실행되는 시점에 non-static 생성이 안되어 있을 수도 있고,
		//어떤 객체의 대상인지 구분이 불가능하다.
//		count++;
	}
	
	
}




