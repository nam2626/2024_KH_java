package e04_join;

import java.util.Random;

public class DiceThread extends Thread{

	public DiceThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random r = new Random();
		int count = 0;
		
		while(true) {
			//주사위(1~6)를 두번 굴려서
			//각 주사위가 전부 6이 나올때까 굴림
			//주사위를 굴릴때마다 주사위를 굴린 횟수를 count에 저장
		}
	}
	
}



