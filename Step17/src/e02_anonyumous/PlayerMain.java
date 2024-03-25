package e02_anonyumous;

public class PlayerMain {

	public static void main(String[] args) {
		Gun k2 = new Gun() {
			
			@Override
			public void shot() {
				System.out.println("K2 shot");
			}
			
			@Override
			public void reload() {
				System.out.println("K2 reload");
			}
		};
		
		Player p = new Player(k2);
		p.shot();
		
		p.setGun(new Gun() {
			
			@Override
			public void shot() {
				System.out.println("AK47 shot()");
			}
			
			@Override
			public void reload() {
				System.out.println("AK47 reload()");
			}
		});
		p.shot();
		p.reload();
	}

}








