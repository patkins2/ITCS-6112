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

public class showDoctorListTest {
	@Test
	void test1()
	{
		//JSONArray arrayObj = null;
		ServiceUser serviceUser = new ServiceUser();
		ArrayList<Doctor> doctorList = null;
		ArrayList<String> doctorInfoList = new ArrayList<String>();
		doctorList = serviceUser.getDoctorListFromDb();
		for(Doctor d:doctorList) {
			doctorInfoList.add(d.toString());
		}
		System.out.println(doctorList.toString());
		Assert.assertEquals("Test failed", "[doctor11@gmail.com|||Anna|||null, doctor12@gmail.com|||David|||null]", doctorList.toString());
	}

}
