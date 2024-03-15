package e07_static;
/*
 * 	Card 객체가 생성 될때 사용자 이름을 받음
 * 	카드번호를 하나 읽어와서 필드에 저장
 * 
 * 	필드 : 카드번호, 사용자 이름
 * 
 * 	생성자
 * 		사용자 이름을 받음, 카드번호는 static에 저장된 숫자를 읽어와서 저장 후 증가
 * 
 * 	toString 작성
 * 
 * 	static에 저장된 발급될 카드번호는 생성자에서 하나씩 카드번호가 부여 될때마다 하나씩 증가
 *  카드번호 시작값 1000부터 시작
 *  
 *  메인에서 테스트하는 코드 CardMain 에서 테스트
 * 
 * 
 */
public class Card {
	private String name;
	private int cardNo;

	private static int cardNoSeq = 1000;
	
	public Card(String name) {
		this.name = name;
		cardNo = cardNoSeq++;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", cardNo=" + cardNo + "]";
	}
	
	
	
}








