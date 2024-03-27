package e01_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileTest {

	public static void main(String[] args) {
		File parentPath = new File("c:\\test\\txt");

		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력하세요 : ");
		String fileName = sc.nextLine();

//		File newFile = new File(parentPath.getAbsolutePath() + "\\" + fileName);
		File newFile = new File(parentPath, fileName);
//		System.out.println(newFile.getAbsolutePath());
//		System.out.println(newFile.exists());

		try {
			// 파일 생성 작업
			// 1. 해당 폴더까지 경로가 있는지 체크
			if (!parentPath.exists()) {
				parentPath.mkdirs();//경로에 해당하는 모든 폴더를 없는 경우 생성
				System.out.println("해당 경로 생성 완료");
			}
			// 2. 파일 생성
			boolean result = newFile.createNewFile();
			if(result)
				System.out.println("파일 생성 성공");
			else
				System.out.println("파일 생성 실패");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
