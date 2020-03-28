package cn.anxcyun.www.control;

import java.util.List;

import cn.anxcyun.www.dao.UserDao;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class ServiceUser {
	
	UserDao userDao = new UserDao();

	public boolean LoginDoctor(Doctor user) {
		
		return  userDao.loginDoctor(user);
	}
	
	public boolean InsertDoctor(Doctor user) {
		
		return  userDao.InsertDoctor(user);
	}

	public boolean LoginPatients(Patients user) {
		
		return  userDao.loginPatients(user);
	}
	
	public boolean InsertPatients(Patients user) {
		
		return  userDao.InsertPatient(user);
	}
	
	public List<Doctor> doctorList(){
		
		return userDao.doctorList();
	}
	
	public boolean checkDoctor(String email) {
		
		return  userDao.checkDoctor(email);
	}
	
	public boolean checkDoctorStatus(String email) {
		
		return  userDao.checkDoctorStatus(email);
	}
	
	public List<Patients> patientList(){
		
		return userDao.patientList();
	}

}
