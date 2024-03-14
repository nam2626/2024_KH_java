package e06_ex;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		
		for(int i=0;i<776;i++)
			tv.chUp();
		
		for(int i=0;i<30;i++)
			tv.chDown();
		
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
	}

}
