package e02_collection;

import java.util.TreeSet;

public class NumberSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		//숫자 10개 저장, 2개 중복된 값을 저장
		set.add(10);
		set.add(5);
		set.add(7);
		set.add(4);
		set.add(1);
		set.add(10);
		set.add(17);
		set.add(12);
		set.add(13);
		set.add(16);
		set.add(11);
		set.add(20);
		
		System.out.println(set);
	}
}
