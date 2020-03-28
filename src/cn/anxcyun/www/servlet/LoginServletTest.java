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
		Assert.assertEquals("InsertDoctor tag is wrong", true, flag1);
		Assert.assertEquals("InsertPatient tag is wrong",false, flag2);
		
	}
	@Test
	void test2() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		doctor.setEmail("doctor3@gmail.com");
		doctor.setPassword("qweQWE123");
		patients.setEmail("doctor3@gmail.com");
		patients.setPassword("qweQWE123");
		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag1);
		Assert.assertEquals("InsertPatient tag is wrong", false, flag2);
		
	}
	
	@Test
	void test3() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		doctor.setEmail("qwe@gmail.com");
		doctor.setPassword("qweQWE123");
		patients.setEmail("qwe@gmail.com");
		patients.setPassword("qweQWE123");
		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag1);
		Assert.assertEquals("InsertPatient tag is wrong", false, flag2);
		
	}
	
	@Test
	void test4() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		doctor.setEmail("Ben@gmail.com");
		doctor.setPassword("123456");
		patients.setEmail("Ben@gmail.com");
		patients.setPassword("123456");
		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag1);
		Assert.assertEquals("InsertPatient tag is wrong", true, flag2);
		
	}
	
	@Test
	void test5() {
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		doctor.setEmail("Ben@gmail.com@gmail.com");
		doctor.setPassword("qweQWE123");
		patients.setEmail("Ben@gmail.com@gmail.com");
		patients.setPassword("qweQWE123");
		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		Assert.assertEquals("InsertDoctor tag is wrong", false, flag1);
		Assert.assertEquals("InsertPatient tag is wrong", false, flag2);
		
	}

}
