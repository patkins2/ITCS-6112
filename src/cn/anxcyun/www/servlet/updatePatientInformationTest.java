package cn.anxcyun.www.servlet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class updatePatientInformationTest {
	void test1() {
		ServiceUser serviceUser = new ServiceUser();
		Patients user =new Patients();
		user.setEmail("bob@gmail.com");
		user.setAddress("123 Main St");
		user.setTelephoneNumber("1234567980");
		user.setGender("M");
		user.setbirthDate("08-19-2001");
		user.setMedicalHistory("Broken leg");
		boolean flag = serviceUser.updatePatientInformation(user);
		Assert.assertEquals("InsertPatient tag is wrong", true, flag);
		
	}
	
	@Test
	void test2() {
		ServiceUser serviceUser = new ServiceUser();
		Patients user =new Patients();
		user.setEmail("doctor1@gmail.com");
		user.setAddress("450 MLK Rd");
		user.setTelephoneNumber("1234567980");
		user.setGender("F");
		user.setbirthDate("08-19-2010");
		user.setMedicalHistory("Back pain");
		boolean flag = serviceUser.updatePatientInformation(user);
		Assert.assertEquals("InsertPatient tag is wrong", false, flag);
		
	}
}
