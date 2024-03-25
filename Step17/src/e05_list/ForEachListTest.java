package e05_list;

import java.util.ArrayList;

public class ForEachListTest {
	private static double max = 0.0;
	public static void main(String[] args) {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		// 샘플 데이터 10건 리스트에 추가
		list.add(new StudentDTO("S001", "김철수", "컴퓨터공학과", 3.7));
		list.add(new StudentDTO("S002", "이영희", "전기전자공학과", 3.2));
		list.add(new StudentDTO("S003", "박민수", "화학과", 3.9));
		list.add(new StudentDTO("S004", "정지영", "생물학과", 4.0));
		list.add(new StudentDTO("S005", "홍길동", "의학과", 3.5));
		list.add(new StudentDTO("S006", "이지현", "경제학과", 4.2));
		list.add(new StudentDTO("S007", "김영남", "영문학과", 1.3));
		list.add(new StudentDTO("S008", "최민지", "무용학과", 2.3));
		list.add(new StudentDTO("S009", "배영호", "음악학과", 1.2));
		list.add(new StudentDTO("S010", "송영철", "미술학과", 2.5));
		
		//리스트에 저장된 학생들의 평점의 평균
		double avg = 0.0;
		
		for (StudentDTO studentDTO : list) {
			avg += studentDTO.getScore();
		}
		
		System.out.println("전체 학생들의 평점 : " + avg / list.size());
		
		//리스트에 저장된 학생들의 최고점을 가진 학생들을 조회
		ArrayList<Double> scores = new ArrayList<Double>();
		
		for (StudentDTO dto : list) {
			scores.add(dto.getScore());
		}
		
		System.out.println(scores);
		//평점이 3.0 이상인 학생들 조회
		list.forEach(t -> {
			if(t.getScore() >= 3.0)
				t.printInfo();
		});
		
		//병렬 처리
		max = scores.parallelStream().reduce(0.0, (pre, item) ->{
			return pre > item ? pre : item;
		});
		System.out.println(max);
		
		System.out.println(
				list.parallelStream().filter(item -> item.getScore() == max).toList());
		
		System.out.println(
				scores.parallelStream().reduce(0.0, (pre, curr) -> pre + curr) / scores.size());
	}

}



