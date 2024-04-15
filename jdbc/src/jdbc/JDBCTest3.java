package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("PID 입력 : ");
		String pid = sc.next();
		System.out.print("이름 입력 : ");
		String pname = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					"c##scott", "123456");
			String sql = "insert into person values(?,?,?)";
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}


