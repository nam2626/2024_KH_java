package e02_method;

public class Student {
	//필드
	//학생은 학번, 이름, 학과명, 평점, 성별을 가지고 있음
	String studentNo;
	String studentName;
	String majorName;
	double score;
	boolean gender;
	
	//메서드
	//데이터를 외부로 부터 받아서 초기화하는 메서드
	void init(String no, String name, String major, double s, boolean g) {
		studentNo = no;
		studentName = name;
		majorName = major;
		if(s >= 0 && s <= 4.5)
			score = s;
		gender = g;
	}
	String getGrade() {
		int s = (int)(score * 10);
		String result = "F";
		switch(s / 5) {
		case 9:
			result = "A+";
			break;
		case 8:
			result = "A";
			break;
		case 7:
			result = "B+";
			break;
		case 6:
			result = "B";
			break;
		case 5:
			result = "C+";
			break;
		case 4:
			result = "C";
			break;
		case 3:
			result = "D+";
			break;
		case 2:
			result = "D";
			break;
		}
		return result;
	}
	//학생 정보를 출력하는 메서드
	//출력예시 >> 20201111 홍길동 컴퓨터공학과 3.7(B+)
	void printStudentInfo() {
		System.out.printf("%s %s %s %.2f(%s)\n",studentNo,studentName,
				majorName,score,getGrade());
	}
}





