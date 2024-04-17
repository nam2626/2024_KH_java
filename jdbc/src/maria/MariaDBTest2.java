package maria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;

import config.CustomDataSource;

public class MariaDBTest2 {

	public static void main(String[] args) {
		try {
//			CustomDataSource cds = new CustomDataSource(CustomDataSource.MARIA);
			CustomDataSource cds = new CustomDataSource(CustomDataSource.ORACLE);
			String sql = "select * from student";
			try (Connection conn = cds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						System.out.println(
								rs.getString(1) + " " + rs.getString(2));
					}
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
