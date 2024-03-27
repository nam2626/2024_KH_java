package e01_file;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteFileTest {

	public static void main(String[] args) {
		File parentPath = new File("c:\\test\\txt");
		Scanner sc = new Scanner(System.in);
		
		//해당 폴더에 있는 모든 파일 목록을 출력
//		String[] fileList = parentPath.list();
		File[] fileList = parentPath.listFiles();
		List<File> list = Arrays.asList(fileList);
		list.forEach(item -> System.out.println(item.getName()));
		
		//삭제할 파일명을 받아서 해당 파일을 삭제
		System.out.print("삭제할 파일명 입력 : ");
		String fileName = sc.nextLine();
		//파일삭제 - 휴지통으로 가지 않음
		File file = new File(parentPath,fileName);
		if(file.delete())
			System.out.println("파일 삭제 성공");
		else
			System.out.println("파일 삭제 실패");
	}

}









