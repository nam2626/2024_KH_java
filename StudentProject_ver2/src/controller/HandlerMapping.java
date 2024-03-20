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
			RegisterController register = new RegisterController();
			register.execute();
			break;
		case 2:
			SearchController search = new SearchController();
			search.execute();
			break;
		case 3:
			service.deleteStudent();
			break;
		case 4:
			service.updateStudent();
			break;
		case 5:
			service.printAllStudent();
			break;
		}
		
		return controller;
	}
	
	
}






