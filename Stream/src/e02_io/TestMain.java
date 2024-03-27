package e02_io;

import java.io.File;

public class TestMain {

	public static void main(String[] args) {
		System.out.println((int)'\r' + " " + (int)'\n');
		IOTest io = new IOTest();
		System.out.println("문자열"+System.lineSeparator()+" 입력" + File.separator);
		System.out.println(io.readline());
	}

}
