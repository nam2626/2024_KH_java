package e01_init;

import java.util.ArrayList;

public class RunnableMain {

	public static void main(String[] args) {
		ArrayList<Thread> list = new ArrayList<Thread>();

		for (int i = 0; i < 10; i++)
			list.add(new Thread(new RunnableRun(), "스레드" + i));

		list.forEach(t -> t.start());
		System.out.println("main 종료 " + RunnableRun.getTime());
	}

}
