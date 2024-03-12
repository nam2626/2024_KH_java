package e01_field;

public class StudentMain {

	public static void main(String[] args) {
		//학생 정보 하나 저장할 객체를 생성
		//데이터를 저장한 후에 출력
		Student std = new Student();
		
		std.studentNo = "20101111";
		std.studentName = "홍길동";
		std.birth = "1999-08-15";
		std.gender = true;
		std.majorName = "경영학과";
		std.profileImgURL = "https://img.student.com/20101111";
		
		System.out.println(std.studentNo);
		System.out.println(std.studentName);
		System.out.println(std.birth);
		System.out.println(std.majorName);
		System.out.println(std.gender);
		System.out.println(std.profileImgURL);
	}

}






