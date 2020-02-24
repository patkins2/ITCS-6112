package com.jcg.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyDb {

	static ResultSet rsObj = null;
	static Statement stmtObj = null;
	static Connection connObj = null;

	/***** Method #1 :: This Method Is Used To Create A Connection With The Database *****/
	private static Connection connectDb() {
		String connUrl = "jdbc:mysql://localhost:3306/test?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connObj = DriverManager.getConnection(connUrl + "user=root&password=123456");			
		} catch (Exception exObj) {
			exObj.printStackTrace();
		}
		return connObj;
	}

	/***** Method #2 :: This Method Is Used To Retrieve The Records From The Database *****/
	public static List<Employee> getEmployeeListFromDb() {		
		Employee emp = null;
		List<Employee> eList = new ArrayList<Employee>();
		try {
			stmtObj = connectDb().createStatement();

			String sql = "SELECT * FROM users";
			rsObj = stmtObj.executeQuery(sql);
			while(rsObj.next()) {
				emp = new Employee(rsObj.getInt("id"), rsObj.getString("firstname"), rsObj.getString("lastname"));
				eList.add(emp);
			}
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		} finally {
			disconnectDb();
		}
		return eList;
	}

	/***** Method #3 :: This Method Is Used To Close The Connection With The Database *****/
	public static void disconnectDb() {
		try {
			rsObj.close();
			stmtObj.close();
			connObj.close();
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		}		
	}
}