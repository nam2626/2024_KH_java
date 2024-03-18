package e05_has_a;

/*
 * 	Player는 총을 상속 받아서
 * 	총을 쏘는 행위를 하면 총 클래스에 있는 shot을 호출하게끔 처리
 *  재장전 하는 행위도 총 클래스에 있는 reload를 호출해서 처리
 *  Player도 shot, reload 메서드를 가지고 있음
 *  shot 메서드에서 총 클래스의 shot을 호출
 *  reload 메서드에서 총 클래스의 reload를 호출
 *  
 *  PlayerMain 클래스를 만들어서 Player 생성해서 shot과 reload를 테스트
 *  
 *  객체와 객체의 Has a 관계를 상속구조로 표현하게되면 문제가 발생
 *  플레이어의 경우 다양한 총기를 교체해야되는데, 상속으로 표현하면 총기하나에 귀속, 확장성이 떨어짐
 *  총기 교환을 할려면 코드를 수정해야되는 문제가 생김
 *  이런 문제 때문에 Has a 관계를 표현할 때는 상속 구조로 표현하면 안됨
 */

public class Player extends K2{
	
	@Override
	public void shot() {
		super.shot();
		System.out.println("잔탄 : " + bullet);
	}

	@Override
	public void reload() {
		super.reload();
	}

}












