package maria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mariadb.jdbc.MariaDbDataSource;

public class MariaDBTest {

	public static void main(String[] args) {
		MariaDbDataSource mds = new MariaDbDataSource();
		try {
			//접속주소:포트번호/사용할DB
			mds.setUrl("jdbc:mariadb://접속주소:포트번호/DB명");
			mds.setUser("아이디");
			mds.setPassword("비밀번호");
			String sql = "select * from student";
			try(Connection conn = mds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				try(ResultSet rs = pstmt.executeQuery()){
					while(rs.next()) {
						System.out.println(
							rs.getString(1) + " "
							+ rs.getString(2) + " "
							+ rs.getInt(3) + " "
							+ rs.getDouble(4));
					}
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}



