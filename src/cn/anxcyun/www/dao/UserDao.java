package cn.anxcyun.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;
import cn.anxcyun.www.util.JDBConn;

public class UserDao {
	
//	登陆功能实现
	public boolean loginDoctor(Doctor user) {
		
		boolean flag=false;//默认登陆失败
		String sql= "select count(1) from doctor where email=? and password=?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			//执行sql
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getEmail());
			prestatement.setString(2, user.getPassword());
			ResultSet rs = prestatement.executeQuery();
			//获取第一列
			while(rs.next()) {
				int result = rs.getInt(1);
				if(result>=1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				//关闭连接
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return flag;
	}
	
	public boolean loginPatients(Patients user) {
		
		boolean flag=false;//默认登陆失败
		String sql= "select count(1) from patient where email=? and password=?;";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			//执行sql
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getEmail());
			prestatement.setString(2, user.getPassword());
			ResultSet rs = prestatement.executeQuery();
			//获取第一列
			while(rs.next()) {
				int result = rs.getInt(1);
				if(result>=1) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				//关闭连接
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean InsertPatient(Patients user) {
		boolean flag=false;//默认注册失败
		String sql= "insert into patient(email,username,password) values(?,?,?);";
		Connection conn =JDBConn.ConnJDBC();
		PreparedStatement prestatement = null ;
		
		try {
			//执行sql
			prestatement= conn.prepareStatement(sql);
			prestatement.setString(1, user.getEmail());
			prestatement.setString(2, user.getUsername());
			prestatement.setString(3, user.getPassword());
			
			//获取修改的行数
			int count = prestatement.executeUpdate();
			if(count>=1) {
				flag =true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				//关闭连接
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
				user.setPassword(rs.getString(3));
				userlist.add(user);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				//关闭连接
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				//关闭连接
				prestatement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	public List<Patients> patientList(){
		List<Patients> userlist = new LinkedList<Patients>();
		String sql= "select email, username, password from doctor;";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userlist;
	}
	
}