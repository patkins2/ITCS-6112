package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

class LoginServletTest {

	@Test
	void test1() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		doctor.setEmail("doctor1@gmail.com");
		doctor.setPassword("qweQWE123");
		patients.setEmail("doctor1@gmail.com");
		patients.setPassword("qweQWE123");
		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag1);
		Assert.assertEquals("InsertPatient tag is wrong",false, flag2);
		
	}
	@Test
	void test2() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		doctor.setEmail("doctor2@gmail.com");
		doctor.setPassword("qweQWE123");
		patients.setEmail("doctor2@gmail.com");
		patients.setPassword("qweQWE123");
		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag1);
		Assert.assertEquals("InsertPatient tag is wrong", false, flag2);
		
	}

}
