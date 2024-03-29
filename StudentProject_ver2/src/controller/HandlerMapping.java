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
			controller = new DeleteController();
			break;
		case 4:
			controller = new UpdateController();
			break;
		case 5:
			controller = new PrintAllController();
			break;
		case 6:
			controller = new FilterController();
			break;
		case 7:
			controller = new SearchNameController();
			break;
		}
		
		return controller;
	}
	
	
}






