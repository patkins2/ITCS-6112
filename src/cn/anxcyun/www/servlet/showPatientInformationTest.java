package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.MeasureData;
import cn.anxcyun.www.po.Patients;

public class showPatientInformationTest {
	@Test
	void test1()
	{
		String patientEmail = "Ben@gmail.com";
		
		ServiceUser serviceUser = new ServiceUser();
		ArrayList<MeasureData> measureData = null;
		measureData = serviceUser.getMeasureDataFromDb(patientEmail);
		
		Patients patients = serviceUser.getPatientsFromDb(patientEmail).get(0);
		Assert.assertEquals("Test failed", "Ben", patients.getUsername());
		//System.out.println(measureData.get(0).getBloodPressure());
	}
	
	@Test
	void test2()
	{
		String patientEmail = "Lily@gmail.com";
		
		ServiceUser serviceUser = new ServiceUser();
		ArrayList<MeasureData> measureData = null;
		measureData = serviceUser.getMeasureDataFromDb(patientEmail);
		Assert.assertEquals("Test failed", "64", measureData.get(0).getHeight());
	}

}
