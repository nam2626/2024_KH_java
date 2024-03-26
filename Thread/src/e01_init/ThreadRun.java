package e01_init;

public class ThreadRun extends Thread{

	@Override
	public void run() {
		//스레드가 일하는 부분
		for(int i=0;i<100;i++) {
			System.out.println(getName() + " " + i + "번째 일");
		}
		System.out.println(getName() + " 종료");
	}
}
