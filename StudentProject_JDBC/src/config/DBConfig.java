package config;

public interface DBConfig {
	public String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public String DB_DRIVER = "oracle.jdbc.OracleDriver";
	public String DB_USER = "c##scott";
	public String DB_PASSWD = "123456";
}
