package e04_quest;

/*
 * 전원 관리하는 클래스
 * 		전원 값 
 * 		전원을 켜고끄고하는 메서드
 * 		전원을 켜는 메서드, 전원을 끄는 메서드
 */
public class Power {
	protected boolean power;

	public Power() {
		power = false;
	}
	
	//전원OnOff
	public void powerOnOff() {
		power = !power;
	}
	//전원On
	public void powerOn() {
		power = true;
	}
	//전원Off
	public void powerOff() {
		power = false;
	}
	
	
}













