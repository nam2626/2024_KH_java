package postgre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.postgresql.ds.PGPoolingDataSource;
import org.postgresql.osgi.PGDataSourceFactory;

import config.CustomDataSource;

public class PostgreTest {

	public static void main(String[] args) {
		//Postgre 연결
		PGPoolingDataSource pds = new PGPoolingDataSource();
		pds.setURL("jdbc:postgresql://nam3324.synology.me:32830/scott_db");
		pds.setUser("scott");
		pds.setPassword("tiger");
		try {
			String sql = "select * from student";
			try (Connection conn = pds.getConnection();
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
