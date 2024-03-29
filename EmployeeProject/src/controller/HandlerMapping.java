package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller = null;
		
		switch (no) {
		case 1:
			controller = new DeleteController();
			break;
		case 2:
			controller = new PrintAllController();
			break;
		case 3:
			controller = new Search3000Controller();
			break;
		}
		
		
		return controller;
	}
}








