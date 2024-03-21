package e02_generic_extends;

public class MouseHUB<T extends Mouse> {
	private T mouse;

	public MouseHUB(T mouse) {
		this.mouse = mouse;
	}
	
	public void click(int n) {
		mouse.click(n);
	}
	
	public void wheel() {
		mouse.wheel();
	}
}
