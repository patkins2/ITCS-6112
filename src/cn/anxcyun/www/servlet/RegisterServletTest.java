package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

class RegisterServletTest {

	@Test
	void test1() {
		ServiceUser serviceUser = new ServiceUser();
		String email = new String("doctor1@gmail.com");
		String username =new String("Anna");
		String password = new String("qweWEE123");
		String select = new String("1");
		boolean flag1 = serviceUser.checkDoctor(email);
		boolean flag2 = serviceUser.checkDoctorStatus(email);
		Assert.assertEquals("flag1 is wrong", true, flag1);
		Assert.assertEquals("flag2 is wrong", true, flag1);
	}
	@Test
	void test2() {
		ServiceUser serviceUser = new ServiceUser();
		String email = new String("doctor2@gmail.com");
		String username =new String("Anna");
		String password = new String("qweWEE123");
		String select = new String("1");
		boolean flag1 = serviceUser.checkDoctor(email);
		boolean flag2 = serviceUser.checkDoctorStatus(email);
		Assert.assertEquals("flag1 is wrong", true, flag1);
		Assert.assertEquals("flag2 is wrong", true, flag1);
	}
	@Test
	void test3() {
		ServiceUser serviceUser = new ServiceUser();
		String email = new String("qwe@gmail.com");
		String username =new String("Anna");
		String password = new String("qweWEE123");
		String select = new String("1");
		boolean flag1 = serviceUser.checkDoctor(email);
		boolean flag2 = serviceUser.checkDoctorStatus(email);
		Assert.assertEquals("flag1 is wrong", false, flag1);
		Assert.assertEquals("flag2 is wrong", false, flag1);
	}
	@Test
	void test4() {
		ServiceUser serviceUser = new ServiceUser();
		String email = new String("qwe@gmail.com");
		String username =new String("Anna");
		String password = new String("qweWEE123");
		String select = new String("2");
		boolean flag1 = serviceUser.checkDoctor(email);
		boolean flag2 = serviceUser.checkDoctorStatus(email);
		Assert.assertEquals("flag1 is wrong", false, flag1);
		Assert.assertEquals("flag2 is wrong", false, flag1);
	}
	@Test
	void test5() {
		ServiceUser serviceUser = new ServiceUser();
		Patients patients = new Patients();		
	    patients.setEmail("qwer@gmail.com");
	    patients.setUsername("qwe");
	    patients.setPassword("qweWEE123");
		boolean flag1 = serviceUser.InsertPatients(patients);
		Assert.assertEquals("flag1 is wrong", true, flag1);
	}
	@Test
	void test6() {
		ServiceUser serviceUser = new ServiceUser();
		Patients patients = new Patients();		

	    patients.setEmail("qwe@gmail.com");
	    patients.setUsername("qwe");
	    patients.setPassword("qweWEE123");
		boolean flag1 = serviceUser.InsertPatients(patients);
		Assert.assertEquals("flag1 is wrong", true, flag1);
	}

}
