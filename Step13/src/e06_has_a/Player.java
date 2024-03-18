package e06_has_a;

public class Player {
	private Gun gun;

	public Player(Gun gun) {
		this.gun = gun;
	}

	public void changeGun(Gun gun) {
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}
	
}
