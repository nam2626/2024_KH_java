package e02_collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	/*
	 * 	Set
	 * 		1. 데이터를 중복해서 저장하지 않음
	 * 		2. 자동 정렬
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		//데이터 등록
		System.out.println(set.add("HTML/CSS"));
		System.out.println(set.add("js/jQuery"));
		System.out.println(set.add("React"));
		System.out.println(set.add("HTML/CSS"));
		System.out.println(set.add("JAVA"));
		System.out.println(set.add("React"));
		
		System.out.println(set);
		
		//데이터 삭제
		set.remove("JAVA");
		System.out.println(set.remove("React"));
		System.out.println(set.remove("React"));
		System.out.println(set);
		
		//데이터 개수 출력
		System.out.println(set.size());
		//데이터 검색 - HTML/CSS
		System.out.println(set.contains("HTML/CSS"));
		System.out.println(set.contains("React"));
		
		//set 내용 비우기
//		set.clear();
		System.out.println(set);
		//set이 비어 있는지 체크
		System.out.println(set.isEmpty());
		
		//전체 조회 - 1
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("------------");
		//전체 조회 - 2
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		//전체 조회 - 3
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}












