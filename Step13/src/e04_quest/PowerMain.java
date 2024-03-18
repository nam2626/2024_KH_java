package e04_quest;

import java.util.ArrayList;
import java.util.Scanner;

public class PowerMain {
	private static ArrayList<Power> list = new ArrayList<Power>();
	
	public static void main(String[] args) {
		list.add(new TV());
		list.add(new Aircon());
		list.add(new Light());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 전체 전원 On");
			System.out.println("2. 전체 전원 Off");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호 입력 : ");
			int no = sc.nextInt();
			
		}
	}

}





