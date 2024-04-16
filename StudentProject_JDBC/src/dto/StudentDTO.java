package dto;

import java.util.Objects;

public class StudentDTO {
	private String studentNo;
	private String studentName;
	private int majorNo;
	private String majorName;
	private double score;
	private char gender;
	public StudentDTO(String studentNo, String studentName, int majorNo, String majorName, double score, char gender) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorNo = majorNo;
		this.majorName = majorName;
		this.score = score;
		this.gender = gender;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMajorNo() {
		return majorNo;
	}
	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "StudentDTO [studentNo=" + studentNo + ", studentName=" + studentName + ", majorNo=" + majorNo
				+ ", majorName=" + majorName + ", score=" + score + ", gender=" + gender + "]";
	}

	public void printStudentInfo() {
		System.out.println(String.format("%s %s %s %f %c", 
				studentNo,studentName,majorName,score,gender));
	}
	
	
}




