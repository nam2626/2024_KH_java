
public class E15_StringEquals {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		String str3 = new String("안녕하세요");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
	}

}





