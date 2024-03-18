package e06_has_a;

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
	
	

	
}
