package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class saveCareRelationshipTest {
	@Test
	void test1()
	{
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patient = new Patients();
		
		doctor.setEmail("doctor11@gmail.com");
		patient.setEmail("Ben@gmail.com");
		
		boolean flag = serviceUser.saveCareRelationship(doctor.getEmail(), patient.getEmail());
		Assert.assertEquals(true, flag);
	}
	@Test
	void test2()
	{
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patient = new Patients();
		
		doctor.setEmail("doctor2@gmail.com");
		patient.setEmail("Bill@gmail.com");
		
		boolean flag = serviceUser.saveCareRelationship(doctor.getEmail(), patient.getEmail());
		Assert.assertEquals(false, flag);
	}

}
