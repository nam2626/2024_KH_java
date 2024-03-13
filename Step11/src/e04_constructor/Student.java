package e04_constructor;

public class Student {
	//학번
	private String stduentNo;
	//이름
	private String studentName;
	//학과명
	private String majorName;
	//평점
	private double score;

	public Student() {
		this("1111111","홍길동","경영학과",1.0);
	}

	public Student(String stduentNo, String studentName, String majorName, double score) {
		this.stduentNo = stduentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

	public String getStduentNo() {
		return stduentNo;
	}

	public void setStduentNo(String stduentNo) {
		this.stduentNo = stduentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [stduentNo=" + stduentNo + ", studentName=" + studentName + ", majorName=" + majorName
				+ ", score=" + score + "]";
	}
	

	

	
	
	
	
}
