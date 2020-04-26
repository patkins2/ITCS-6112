package cn.anxcyun.www.servlet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;

public class updateDoctorInformationTest {

	@Test
	void test1() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor user =new Doctor();
		user.setEmail("doctor1@gmail.com");
		user.setAddress("123 Main St");
		user.setTelephoneNumber("1234567980");
		user.setGender("M");
		boolean flag = serviceUser.updateDoctorInformation(user);
		Assert.assertEquals("InsertDoctor tag is wrong", true, flag);
		
	}
	
	@Test
	void test2() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor user =new Doctor();
		user.setEmail("Ben@gmail.com");
		user.setAddress("800 South Blvd");
		user.setTelephoneNumber("5555555555");
		user.setGender("F");
		boolean flag = serviceUser.updateDoctorInformation(user);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag);
		
	}
}
