package cn.anxcyun.www.control;

import java.util.List;

import cn.anxcyun.www.dao.UserDao;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.MeasureData;
import cn.anxcyun.www.po.Patients;
import java.util.ArrayList;
public class ServiceUser {
	
	UserDao userDao = new UserDao();

	public boolean LoginDoctor(Doctor user) {
		
		return  userDao.loginDoctor(user);
	}
	
	public boolean InsertDoctor(Doctor user) {
		
		return  userDao.InsertDoctor(user);
	}
	
	public boolean CheckPatientFromCare(String email) {
		
		return  userDao.CheckPatientFromCare(email);
	}
	
	public boolean saveCareRelationship(String doctorEmail, String patientEmail) {
		
		return  userDao.saveCareRelationship(doctorEmail, patientEmail);
	}
	
	public boolean updateCareRelationship(String doctorEmail, String patientEmail) {
		
		return  userDao.updateCareRelationship(doctorEmail, patientEmail);
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
	
	public ArrayList<Doctor> getDoctorFromCare(String email){
		
		return userDao.getDoctorFromCare(email);
	}
	
	public boolean updateDoctorInformation(Doctor doctor) {
		return  userDao.updateDoctorInformation(doctor);
	}
	
	public ArrayList<Doctor> getDoctorListFromDb(){
		
		return userDao.getDoctorListFromDb();
	}
	
	public ArrayList<MeasureData> getMeasureDataFromDb(String userEmail){
		
		return userDao.getMeasureDataFromDb(userEmail);
	}
	
	public ArrayList<Patients> getPatientsListFromDb(String userEmail){
		
		return userDao.getPatientsListFromDb(userEmail);
	}
	
	public ArrayList<Patients> getPatientsFromDb(String userEmail){
		
		return userDao.getPatientsFromDb(userEmail);
	}
	
	public boolean checkPatientInCarerRelationship(String email) {
		
		return  userDao.checkPatientInCareRelationship(email);
	}
	
	public boolean checkDoctor(String email) {
		
		return  userDao.checkDoctor(email);
	}
	
	public boolean checkDoctorStatus(String email) {
		
		return  userDao.checkDoctorStatus(email);
	}
	public boolean updatePatientInformation(Patients user) {
		return  userDao.updatePatientInformation(user);
	}
	
	public boolean updateMeasureData(String date, String patientEmail, String height,String weight,String bloodPressure,String bloodSugar,String temp) {
		return  userDao.updateMeasureData(date, patientEmail,height,weight,bloodPressure,bloodSugar,temp);
	}
	
	public List<Patients> patientList(){
		
		return userDao.patientList();
	}

}
