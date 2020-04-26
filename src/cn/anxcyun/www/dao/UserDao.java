package cn.anxcyun.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


import java.sql.DriverManager;

import java.sql.Statement;
import java.util.ArrayList;

import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.MeasureData;
import cn.anxcyun.www.po.Patients;
import cn.anxcyun.www.util.JDBConn;

public class UserDao {
	static ResultSet rsObj = null;

	static Statement stmtObj = null;

	static Connection connObj = null;
	public boolean loginDoctor(Doctor user) {
		
		boolean flag=false;
		String sql= "select count(1) from doctor where email=? and password=?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getEmail());
			prestatement.setString(2, user.getPassword());
			ResultSet rs = prestatement.executeQuery();
			while(rs.next()) {
				int result = rs.getInt(1);
				if(result>=1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return flag;
	}
	
	public boolean loginPatients(Patients user) {
		
		boolean flag=false;
		String sql= "select count(1) from patient where email=? and password=?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getEmail());
			prestatement.setString(2, user.getPassword());
			ResultSet rs = prestatement.executeQuery();
			while(rs.next()) {
				int result = rs.getInt(1);
				if(result>=1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return flag;
	}
	
	public boolean InsertDoctor(Doctor user) {
		boolean flag=false;
		String sql= " update doctor set username =?,password = ?, status = 1 where email = ?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getUsername());
			prestatement.setString(2, user.getPassword());
			prestatement.setString(3, user.getEmail());

			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean InsertPatient(Patients user) {
		boolean flag=false;
		String sql= "insert into patient(email,username,password) values(?,?,?);";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getEmail());
			prestatement.setString(2, user.getUsername());
			prestatement.setString(3, user.getPassword());
			
			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean updatePatientInformation(Patients user) {
		boolean flag=false;
		String a= "update patient set address = ?, telephoneNumber = ? , gender = ? ,birthdate = ? ,medicalHistory = ? where email = '";
		String b = user.getEmail();
		String c = a.concat(b);
		String d = "';";
		String sql = c.concat(d);		
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getAddress());
			prestatement.setString(2, user.getTelephoneNumber());
			prestatement.setString(3, user.getGender());
			prestatement.setString(4, user.getbirthDate());
			prestatement.setString(5, user.getMedicalHistory());
			
			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean updateMeasureData(String date, String patientEmail, String height,String weight,String bloodPressure,String bloodSugar,String temp) {
		boolean flag=false;
		String sql= "insert into patienthealthdata values (?,?,?,?,?,?,?)";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, date);

			prestatement.setString(2, patientEmail);
			prestatement.setString(3, height);
			prestatement.setString(4, weight);
			prestatement.setString(5, bloodPressure);
			prestatement.setString(6, bloodSugar);
			prestatement.setString(7, temp);

			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean saveCareRelationship(String doctorEmail, String patientEmail) {
		boolean flag=false;
		String sql= "insert into care(doctorEmail,patientEmail) values(?,?);";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, (String)doctorEmail);
			prestatement.setString(2, (String)patientEmail);			
			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean updateCareRelationship(String doctorEmail, String patientEmail) {
		boolean flag=false;
		String sql= "update care set doctorEmail = ? where patientEmail = ?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, (String)doctorEmail);
			prestatement.setString(2, (String)patientEmail);			
			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	public List<Doctor> doctorList(){
		List<Doctor> userlist = new LinkedList<Doctor>();
		String sql= "select email, username, password from doctor;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		Doctor user;
		
		try {
			prestatement = conn.prepareStatement(sql);
			ResultSet rs = prestatement.executeQuery();
			while(rs.next()) {
				user = new Doctor();
				user.setEmail(rs.getString(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				userlist.add(user);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userlist;
	}
	
	public List<Patients> patientList(){
		List<Patients> userlist = new LinkedList<Patients>();
		String sql= "select email, username, password from patient;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		Patients user;
		
		try {
			prestatement = conn.prepareStatement(sql);
			ResultSet rs = prestatement.executeQuery();
			while(rs.next()) {
				user = new Patients();
				user.setEmail(rs.getString(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				userlist.add(user);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userlist;
	}

	public ArrayList<Patients> getPatientsListFromDb(String userEmail) {		
		Patients user1 = null;
		ArrayList<Patients> userlist = new ArrayList<Patients>();
		try {
			stmtObj = JDBConn.ConnJDBC().createStatement();
			String a = "select username, email, address, telephoneNumber, gender, birthdate, medicalHistory from patient where email = (select patientEmail from care where doctorEmail='";
            String b = userEmail;
            String c = a.concat(b);
            String d = "');";
			String sql= c.concat(d);

			rsObj = stmtObj.executeQuery(sql);
			while(rsObj.next()) {
				user1 = new Patients();
				user1.setUsername(rsObj.getString(1));
				user1.setEmail(rsObj.getString(2));				
				user1.setAddress(rsObj.getString(3));
				user1.setTelephoneNumber(rsObj.getString(4));
				user1.setGender(rsObj.getString(5));
				user1.setbirthDate(rsObj.getString(6));
				user1.setMedicalHistory(rsObj.getString(7));
				userlist.add(user1);
			}
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		} finally {
		}
		return userlist;
	}
	
	public ArrayList<MeasureData> getMeasureDataFromDb(String userEmail) {		
		MeasureData measureData = null;
		ArrayList<MeasureData> measureDatalist = new ArrayList<MeasureData>();
		try {
			stmtObj = JDBConn.ConnJDBC().createStatement();
			String a = "select height, weight, bloodPressure, bloodSugar, temp from patienthealthdata where email = '";
            String b = userEmail;
            String c = a.concat(b);
            String d = "';";
			String sql= c.concat(d);

			rsObj = stmtObj.executeQuery(sql);
			while(rsObj.next()) {
				measureData = new MeasureData();
				measureData.setHeight(rsObj.getString(1));
				measureData.setWeight(rsObj.getString(2));				
				measureData.setBloodPressure(rsObj.getString(3));
				measureData.setBloodSugar(rsObj.getString(4));
				measureData.setTemp(rsObj.getString(4));
				
				measureDatalist.add(measureData);
			}
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		} finally {
		}
		return measureDatalist;
	}
	
	public boolean updateDoctorInformation(Doctor doctor) {

		boolean flag=false;
		String a= "update doctor set address = ?, telephoneNumber = ? , gender = ? , introduction = ? where email = '";
		String b = doctor.getEmail();
		String c = a.concat(b);
		String d = "';";
		String sql = c.concat(d);		
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		try {
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, doctor.getAddress());
			prestatement.setString(2, doctor.getTelephoneNumber());
			prestatement.setString(3, doctor.getGender());
			prestatement.setString(4, doctor.getIntroduction());
			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public ArrayList<Patients> getPatientsFromDb(String userEmail) {		
		Patients user1 = null;
		ArrayList<Patients> userlist = new ArrayList<Patients>();
		try {
			stmtObj = JDBConn.ConnJDBC().createStatement();
			String a = "select username, email, address, telephoneNumber, gender, birthdate, medicalHistory from patient where email ='";
            String b = userEmail;
            String c = a.concat(b);
            String d ="';";
            String sql = c.concat(d);

			rsObj = stmtObj.executeQuery(sql);
			while(rsObj.next()) {
				user1 = new Patients();
				user1.setUsername(rsObj.getString(1));
				user1.setEmail(rsObj.getString(2));				
				user1.setAddress(rsObj.getString(3));
				user1.setTelephoneNumber(rsObj.getString(3));
				user1.setGender(rsObj.getString(4));
				user1.setbirthDate(rsObj.getString(5));
				user1.setMedicalHistory(rsObj.getString(6));
				userlist.add(user1);
			}
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		} finally {
		}
		return userlist;
	}
	
	public ArrayList<Doctor> getDoctorListFromDb() {		
		Doctor user = null;
		ArrayList<Doctor> userlist = new ArrayList<Doctor>();
		try {
			stmtObj = JDBConn.ConnJDBC().createStatement();
			String sql = "select username, email, address, telephoneNumber, gender, introduction from doctor where status = 1;";
			rsObj = stmtObj.executeQuery(sql);
			while(rsObj.next()) {
				user = new Doctor();
				user.setUsername(rsObj.getString(1));
				user.setEmail(rsObj.getString(2));				
				user.setAddress(rsObj.getString(3));
				user.setTelephoneNumber(rsObj.getString(3));
				user.setGender(rsObj.getString(4));
				user.setIntroduction(rsObj.getString(5));
				userlist.add(user);
			}
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		} finally {
		}
		return userlist;
	}
	
	public boolean checkDoctor(String email) {
		boolean flag=false;
		String sql= "select count(*) from doctor where email=?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
		
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, email);
			ResultSet rs = prestatement.executeQuery();
		
			while(rs.next()) {
				int result = rs.getInt(1);
				if(result>=1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	
	public boolean checkPatientInCareRelationship(String email) {
		boolean flag=false;
		String sql= "select count(*) from care where patientEmail=?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
		
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, email);
			ResultSet rs = prestatement.executeQuery();
		
			while(rs.next()) {
				int result = rs.getInt(1);
				if(result>=1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean checkDoctorStatus(String email) {
		boolean flag=false;
		String sql= "select count(*) from doctor where email=? and status = 1;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
		
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, email);
			ResultSet rs = prestatement.executeQuery();
		
			while(rs.next()) {
				int result = rs.getInt(1);
				if(result>=1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public ArrayList<Doctor> getDoctorFromCare(String userEmail) {		
		Doctor user1 = null;
		ArrayList<Doctor> userlist = new ArrayList<Doctor>();
		try {
			stmtObj = JDBConn.ConnJDBC().createStatement();
			String a = "select username, email, address, telephoneNumber, gender, introduction from doctor where email = (select doctorEmail from care where patientEmail='";
            String b = userEmail;
            String c = a.concat(b);
            String d ="');";
            String sql = c.concat(d);

			rsObj = stmtObj.executeQuery(sql);
			while(rsObj.next()) {
				user1 = new Doctor();
				user1.setUsername(rsObj.getString(1));
				user1.setEmail(rsObj.getString(2));				
				user1.setAddress(rsObj.getString(3));
				user1.setTelephoneNumber(rsObj.getString(3));
				user1.setGender(rsObj.getString(4));
				user1.setIntroduction(rsObj.getString(5));
				userlist.add(user1);
			}
		} catch (SQLException sqlExObj) {
			sqlExObj.printStackTrace();
		} finally {
		}
		return userlist;
	}
	
}