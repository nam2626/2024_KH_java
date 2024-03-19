package e02_collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
	}

}



















