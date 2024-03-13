package e05_list;

import java.util.ArrayList;

public class E01_ListEx {

	public static void main(String[] args) {
		//리스트 생성
		ArrayList<String> list = new ArrayList<String>();
		
		//데이터 추가
		list.add("JAVA");
		list.add("Oracle");
		list.add("HTML/CSS");
		list.add("javascript");
		list.add("React");
		list.add("Spring");
		
		System.out.println(list);
		//저장된 데이터 개수
		System.out.println("리스트에 저장된 값의 개수 : "+list.size());
		
		//데이터 꺼내는 방법
		for(int i=0;i<list.size();i++) {
			System.out.println(i + " " + list.get(i));
		}
		
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(2);
		System.out.println(list);
	}

}






