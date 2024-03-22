package e03_exception;

//사용자 정의 Exception
public class UserException extends Exception{

	public UserException(String message) {
		super(message);
	}
	
}
