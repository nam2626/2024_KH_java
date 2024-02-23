
public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(10+5);
		System.out.println(10-5);
		
		//문자열은 명령어와 구분하기 위해서 반드시 큰따옴표로 묶어줘야함
		//문자열1 + 문자열2 --> 문자열1문자열2 : 하나로 합쳐줌
		//문자열 + 100 ---> 문자열100 : 숫자를 문자열로 바꾸어서 하나로 합쳐줌
		System.out.println("Hello");
		System.out.println("Hello" + "World");
		System.out.println("Hello" + 10);
		System.out.println("Hello" + "10");
		
		//안녕하세요9282갑시다2234
		System.out.println("안녕하세요" + (8282 + 1000) + "갑시다." + (1234 + 1000));
		//안녕하세요82821000갑시다12341000
		System.out.println("안녕하세요" + 8282 + 1000 + "갑시다." + 1234 + 1000);
	}
}









