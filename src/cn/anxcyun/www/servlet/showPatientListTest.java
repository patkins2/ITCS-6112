package cn.anxcyun.www.servlet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class showPatientListTest {
	@Test
	void test1()
	{
		//JSONArray arrayObj = null;
		String temp = "doctor11@gmail.com";
		ServiceUser serviceUser = new ServiceUser();
		ArrayList<Patients> patientList = null;
		ArrayList<String> patientInfoList = new ArrayList<String>();
		patientList = serviceUser.getPatientsListFromDb(temp);
		for(Patients d:patientList) {
			patientInfoList.add(d.toString());
		}
		System.out.println(patientList.toString());

		//Assert.assertEquals("Test failed", "[cn.anxcyun.www.po.Patients@2d9caaeb]", patientList.toString());
	}

}
