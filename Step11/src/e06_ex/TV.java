package e06_ex;
/*
 * 	TV가져야될 데이터, 기능
 * 		데이터 : 채널, 음량, 전원, 음소거
 * 		기능 : 채널Up/Down, 음량Up/Down, 전원OnOff, 음소거OnOff 
 * 		
 * 		채널 : 1~776
 * 		음량 : 0~50
 * 		전원 : On, Off
 * 		음소거 : On, Off
 * 
 * 		1. 필드 선언 및 기본 생성자를 이용해서 각 필드에 적절한 값으로 초기화
 * 		   toString까지 작성
 * 	
 * 
 */
public class TV {
	private final int MAX_CHANNEL = 776; 
	private final int MIN_CHANNEL; 
	private final int MAX_VOLUME = 50; 
	private final int MIN_VOLUME = 0; 
	private boolean power;
	private boolean mute;
	private int ch;
	private int vol;
	
	public TV() {
		MIN_CHANNEL = 1;//상수는 선언시 초기화를 안하면 , 생성자에서 초기화 해줘야함
		ch = 7;
		vol = 15;
	}

	@Override
	public String toString() {
		return "TV [power=" + power + ", mute=" + mute + ", ch=" + ch + ", vol=" + vol + "]";
	}
	
	
	//채널Up ==> 채널값 증가, 최대값에 증가하면 첫번째 채널로 이동, 옮긴 채널값을 출력
	public void chUp() {
		if(!power) return;
		//775 776 1 2 3 4 5
		ch %= MAX_CHANNEL;
		ch++;
		System.out.println("현재 채널 : " + ch);
	}
	//채널Down ==> 채널값 감소, 최소값에 감소하면 마지막 채널로 이동, 옮긴 채널값을 출력
	//5 4 3 2 1 776 775 ...
	public void chDown() {
		if(!power) return;
		ch--;
		if(ch < MIN_CHANNEL)
			ch = MAX_CHANNEL;
		System.out.println("현재 채널 : " + ch);
	}
	//전원을 켜고 끄는 작업 --> true면 전원 켜진것, false면 전원이 꺼진것
	//해당 메서드를 실행 할때마다 power의 값이 바뀌어야함
	public void powerOnOff() {
		power = !power;
		System.out.println(power ? "TV 전원 On" : "TV 전원 Off");
	}
	
	//음량 Up - 만약 음소거 활성화(true) 되어있다면 비활성화(false)로 바꿔주고 끝냄
	public void volUp() {
		if(!power) return;
		if(mute) {
			muteOnOff();
			return;
		}
		
		if(vol < MAX_VOLUME)
			vol++;
		
		System.out.println("현재 음량 : "+vol);
	}
	//음량 Down - 만약 음소거 활성화(true) 되어있다면 비활성화(false)로 바꿔주고 끝냄
	public void volDown() {
		if(!power) return;
		if(mute) {
			muteOnOff();
			return;
		}
		
		if(vol > MIN_VOLUME)
			vol--;
		
		System.out.println("현재 음량 : "+vol);
	}
	
	//음소거OnOff 
	public void muteOnOff() {
		if(!power) return;
		
		mute = !mute;
		
		System.out.println(mute ? "음소거 활성화" : "음소거 비활성화");
	}
	
}





















