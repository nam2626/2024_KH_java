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
	private boolean power;
	private boolean mute;
	private int ch;
	private int vol;
	
	public TV() {
		ch = 7;
		vol = 15;
	}

	@Override
	public String toString() {
		return "TV [power=" + power + ", mute=" + mute + ", ch=" + ch + ", vol=" + vol + "]";
	}
	
	
	//채널Up ==> 채널값 증가, 최대값에 증가하면 첫번째 채널로 이동, 옮긴 채널값을 출력
	public void chUp() {
		ch++;
		if(ch > 776)
			ch = 1;
		System.out.println("현재 채널 : " + ch);
	}
	
}















