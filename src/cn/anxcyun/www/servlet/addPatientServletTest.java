package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

class addPatientServletTest {

	@Test
	void test1() {
		ServiceUser serviceUser = new ServiceUser();
		Patients user = new Patients();
		user.setEmail("doctor1@gmail.com");
		user.setUsername("Anna");
		user.setPassword("asdASD123");
		boolean flag = serviceUser.InsertPatients(user);
		Assert.assertEquals("InsertPatient tag is wrong", false, flag);
		
	}

}
