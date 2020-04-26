package cn.anxcyun.www.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.MeasureData;
import cn.anxcyun.www.po.Patients;

public class showPatientInformation extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("testtest");
		JSONArray arrayObj = null;
		String email = (String)req.getParameter("radiobutton");
		System.out.println(email);
		
		ArrayList<MeasureData> measureData = null;
		ArrayList<String> measureDataInfo = new ArrayList<String>();
		
		ServiceUser serviceUser = new ServiceUser();
		String JDBCInfo = "error";
		if(email == null) {
			HttpSession session = req.getSession();
			email = (String)session.getAttribute("userEmail");	
		} 
		measureData = serviceUser.getMeasureDataFromDb(email);
		for(MeasureData d:measureData) {
			measureDataInfo.add(d.toString());
		}

		Patients patients = serviceUser.getPatientsFromDb(email).get(0);
		arrayObj = new JSONArray(measureData);
		req.setAttribute("measureData", measureData);
		req.setAttribute("patients", patients);
		req.getRequestDispatcher("showPatientInformation.jsp").forward(req, resp);
		System.out.println(email);
		System.out.println("success");
	
		
	}
}

