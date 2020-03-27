package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert;
import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;

class addDoctorServletTest {

	@Test
	void test1() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor user =new Doctor();
		user.setEmail("doctor1@gmail.com");
		user.setUsername("Anna");
		user.setPassword("asdASD123");
		boolean flag = serviceUser.InsertDoctor(user);
		Assert.assertEquals("InsertDoctor tag is wrong", true, flag);
		
	}
	@Test
	void test2() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor user =new Doctor();
		user.setEmail("doctor2@gmail.com");
		user.setUsername("Cindy");
		user.setPassword("wdWE132");
		boolean flag = serviceUser.InsertDoctor(user);
		Assert.assertEquals("InsertDoctor tag is wrong", true, flag);
		
	}
	@Test
	void test3() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor user =new Doctor();
		user.setEmail("wer@gmail.com");
		user.setUsername("Anna");
		user.setPassword("asdASD123");
		boolean flag = serviceUser.InsertDoctor(user);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag);
		
	}

}
