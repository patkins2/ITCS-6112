package cn.anxcyun.www.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBConn {
	
	public static Connection conn = null;
	private static final String url="jdbc:mysql://localhost:3306/itcs6112_project?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
	private static final String user="root";
	private static final String password="123456";
	
	public static Connection ConnJDBC() {
		
		try {
//			��������
			Class.forName("com.mysql.jdbc.Driver");
			
			//����
			conn = DriverManager.getConnection(url, user, password);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
