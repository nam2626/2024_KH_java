package e07_instance_of;
/*
 *  총
 *  	필드
 *    		총알 - 최대 12발
 *    	메서드
 *    		총을 쏘는 기능 -> 1발씩 발사, 총알이 없으면 자동으로 재장전
 *    			BBang!
 *    		재장전 -> 총알을 전부 보충
 *    			reload!
 *  	
 */
public class Gun {
	protected int bullet;

	public Gun() {
		bullet = 12;
	}
	
	public void shot() {
		if (bullet == 0) {
			reload();
		} else {
			bullet--;
			System.out.println("BBang!");
		}
	}
	
	public void reload() {
		bullet = 12;
		System.out.println("reload!!");
	}
}












