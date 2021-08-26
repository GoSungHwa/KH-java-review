package first.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTemplate {

//JDBCTemplate 내부 모양은 수십가지임.
	public JDBCTemplate() {
	}
	
	public static Connection getConnection() {
		Connection conn=null;
		 String dr = "oracle.jdbc.driver.OracleDriver";
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 String uid = "scott";
		 String pwd = "TIGER";
		
		try {
			Class.forName(dr);
			conn=DriverManager.getConnection(url,uid,pwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
public static void close(Connection conn) {
	try {
		if(conn != null) conn.close();

	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
