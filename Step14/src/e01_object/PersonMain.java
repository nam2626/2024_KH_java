package e01_object;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("김철수", 20);
		Person p2 = new Person("김철수", 20);
		
		System.out.println(p1);
		System.out.println(Integer.toHexString(p1.hashCode()));
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(Integer.toHexString(p2.hashCode()));
		System.out.println(p2.toString());
	
	}

}
