package e06_has_a;

public class K2 extends Gun{

	public K2() {
		bullet = 24;
	}
	
	@Override
	public void shot() {
		if(bullet < 3)
			reload();
		else {
			bullet -= 3;
			System.out.println("BBang! BBang! BBang!");
		}
	}
	
	@Override
	public void reload() {
		bullet = 24;
		System.out.println("reload!");
	}
}



