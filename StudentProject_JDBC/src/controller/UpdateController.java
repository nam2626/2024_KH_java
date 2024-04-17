package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dto.StudentDTO;
import exception.StudentException;
import service.StudentService;

public class UpdateController implements Controller {

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("학생정보 수정을 시작합니다....");
			System.out.print("수정할 학번 입력 : ");
			String studentNo = sc.nextLine();

			StudentDTO dto = StudentService.getInstance().searchStudent(studentNo);

			if (dto == null) {
				throw new StudentException("수정할 학생 정보가 없습니다");
			}

			System.out.print("수정할 이름 입력 : ");
			String studentName = sc.nextLine();
			System.out.print("수정할 학과번호 입력 : ");
			String majorNo = sc.nextLine();
			System.out.print("수정할 평점 입력 : ");
			double score = sc.nextDouble();
			sc.nextLine();

			dto.setStudentName(studentName);
			dto.setMajorNo(majorNo);
			dto.setScore(score);
			
			StudentService.getInstance().updateStudent(dto);
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}



