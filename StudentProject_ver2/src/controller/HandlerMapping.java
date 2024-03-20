package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int n) {
		Controller controller = null;
		
		switch(n) {
		case 1:
			controller = new RegisterController();
			break;
		case 2:
			controller = new SearchController();
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
		
		return controller;
	}
	
	
}






