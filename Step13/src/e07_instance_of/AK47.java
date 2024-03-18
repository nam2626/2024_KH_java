package e07_instance_of;

public class AK47 extends Gun{

	public AK47() {
		bullet = 28;
	}

	@Override
	public void shot() {
		if(bullet < 2)
			reload();
		else {
			bullet -= 2;
			System.out.println("BangBang!");
		}
	}

	@Override
	public void reload() {
		bullet = 28;
		System.out.println("reload!");
	}
	
	public void fireAll() {
		bullet = 0;
		System.out.println("Bang!!!!");
	}

	
}






