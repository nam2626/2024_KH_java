package e01_file;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RenameFileTest {

	public static void main(String[] args) {
		File parentPath = new File("c:\\test\\txt");
		Scanner sc = new Scanner(System.in);
		
		List<File> list = Arrays.asList(parentPath.listFiles());
		list.forEach(item -> System.out.println(item.getName()));
		
		//삭제할 파일명을 받아서 해당 파일을 삭제
		System.out.print("변경할 기존 파일명 입력 : ");
		String fileName = sc.nextLine();
		System.out.print("변경할 새 파일명 입력 : ");
		String fileNewName = sc.nextLine();
		//기존 파일에 연결
		File file = new File(parentPath,fileName);
		boolean result = file.renameTo(new File(parentPath,fileNewName));
		if(result)
			System.out.println("파일명 변경 완료");
		else
			System.out.println("파일명 변경 실패");
			
	}

}



