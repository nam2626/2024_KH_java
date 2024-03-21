package e02_generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		GamingMouse gamingMouse = new GamingMouse();
		MouseHUB<GamingMouse> hub = new MouseHUB<GamingMouse>(gamingMouse);
		hub.click(2);
		
//		MouseHUB<OfficeMouse> hub2 = new MouseHUB<OfficeMouse>(new OfficeMouse());
	}

}
