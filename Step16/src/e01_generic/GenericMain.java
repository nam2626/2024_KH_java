package e01_generic;

public class GenericMain {

	public static void main(String[] args) {
		//제네릭을 사용하면 저장할 수 있는 타입을 객체 생성시 정해줌
		GenericBox<Apple> appleBox = new GenericBox<Apple>();
		appleBox.setObj(new Apple());
		appleBox.getObj().printApple();
	}

}
