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
	static Connection connectDb() {
		String connUrl = "jdbc:mysql://localhost:3306/healthmanagement?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connObj = DriverManager.getConnection(connUrl + "user=root&password=root");			
		} catch (Exception exObj) {
			exObj.printStackTrace();
		}
		return connObj;
	}

	/***** Method #2 :: This Method Is Used To Retrieve The Records From The Database *****/
	public static List<Doctors> getDoctorsListFromDb() {		
		Doctors doc = null;
		List<Doctors> doctorList = new ArrayList<Doctors>();
		try {
			stmtObj = connectDb().createStatement();

			String sql = "SELECT * FROM doctors";
			rsObj = stmtObj.executeQuery(sql);
			while(rsObj.next()) {
				doc = new Doctors(rsObj.getString("username"), rsObj.getString("email"), rsObj.getString("address"), rsObj.getString("password"), rsObj.getString("telephoneNumber"), rsObj.getString("gender"), rsObj.getInt("patientNumber"), rsObj.getString("introduction"));
				doctorList.add(doc);
			}
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		} finally {
			disconnectDb();
		}
		return doctorList;
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