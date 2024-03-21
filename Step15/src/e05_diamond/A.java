package e05_diamond;

public interface A {
	public void methodA();

	default void method() {
		System.out.println("A");
	}
}
