package e01_init;

import java.util.ArrayList;

public class ThreadMain {

	public static void main(String[] args) {
		ArrayList<ThreadRun> list = new ArrayList<ThreadRun>();
		
		//리스트에 ThreadRun 10개 이상 등록
		for(int i=0;i<10;i++)
			list.add(new ThreadRun("스레드"+i));
		
		//list에 등록된 객체가 가지고 있는 start 메서드를 실행
		//자동으로 일을 시키는 부분
		for(int i=0;i<list.size();i++)
			list.get(i).start();
			
	}

}


