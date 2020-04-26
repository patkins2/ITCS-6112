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

public class updateMeasureDataTest {
	@Test
	void test1()
	{
		String email = "Geneva@gmail.com";
		String date = "02/22/2011";
		String height = "63";
		String weight = "105";
		String bloodPressure = "110/70";
		String bloodSugar = "5.8";
		String temp = "98.7";
		ServiceUser serviceUser = new ServiceUser();
		boolean flag = serviceUser.updateMeasureData(date,email,height,weight,bloodPressure,bloodSugar,temp);
		//Patients patient =new Patients();
		Assert.assertEquals("Test failed", true, flag);
	}
	
	@Test
	void test2()
	{
		String email = "Geneva1@gmail.com";
		String date = "02/22/2011";
		String height = "63";
		String weight = "105";
		String bloodPressure = "110/70";
		String bloodSugar = "5.8";
		String temp = "98.7";
		ServiceUser serviceUser = new ServiceUser();
		boolean flag = serviceUser.updateMeasureData(date,email,height,weight,bloodPressure,bloodSugar,temp);
		//Patients patient =new Patients();
		Assert.assertEquals("Test failed", false, flag);
	}

}
