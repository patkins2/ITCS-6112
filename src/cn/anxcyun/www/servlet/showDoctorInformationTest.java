package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class showDoctorInformationTest {
	@Test
	void test1()
	{
		String patientEmail = "Ben@gmail.com";
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor = serviceUser.getDoctorFromCare(patientEmail).get(0);
        String test = doctor.getUsername();
		Assert.assertEquals("Test failed", "Anna", test);
	}

}
