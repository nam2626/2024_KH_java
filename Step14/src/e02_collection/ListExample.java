package e02_collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

	/*
	 * 	List 특징
	 * 		1. 데이터 중복
	 * 		2. 리스트에 등록된 데이터 순서가 보장됨
	 * 
	 * 	ArrayList : 리스트에서 데이터를 배열로 관리
	 * 	LinkedList : 리스트에서 데이터를 노드 단위로 관리
	 * 
	 */
	public static void main(String[] args) {
		//리스트 생성, <리스트에 저장할 데이터 타입(참조형)>
		ArrayList<String> list = new ArrayList<String>();
		
		//데이터 추가
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("react");
		list.add("jsp");
		list.add("java");
		list.add("jsp");
		
		System.out.println(list);
		
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(2);
		System.out.println(list);
		
		//데이터 삭제 - 값을 기준으로 삭제, 첫번째로 검색된 값 1개만 삭제
		list.remove("jsp");
		System.out.println(list);
		
		//리스트에 저장된 데이터 개수
		System.out.println(list.size());
		
		//리스트에 저장된 데이터를 교체
		list.set(1, "C");
		System.out.println(list);
		
		//데이터를 원하는 인덱스 위치에 추가
		list.add(1, "C#");
		System.out.println(list);
		
		//데이터를 꺼내는 방법 - 1
		for(int i=0;i<list.size();i++) {
			//인덱스 번호를 이용해서 꺼냄
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		//데이터를 꺼내는 방법 - 2
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println("---------------");
		//데이터를 꺼내는 방법 - 3
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------");

		//해당 데이터가 리스트에 있냐?
		System.out.println(list.contains("자바"));
		System.out.println(list.contains("C#"));
		
		//데이터가 몇번째 위치에 있는지?
		System.out.println(list.indexOf("자바"));
		System.out.println(list.indexOf("jsp"));
		
		//리스트에 있는 모든 데이터를 삭제
//		list.clear();
		System.out.println(list);
		
		//리스트가 비었냐?
		System.out.println(list.isEmpty());
		
	}

}



















