package e06_has_a;

public class PlayerMain {

	public static void main(String[] args) {
		Player p = new Player(new Gun());
		for(int i=0;i<20;i++)
			p.shot();
		
		K2 k2 = new K2();
		
		p.changeGun(k2);
		
		for(int i=0;i<20;i++)
			p.shot();

		p.changeGun(new AK47());
		
		for(int i=0;i<20;i++)
			p.shot();
	}

}
