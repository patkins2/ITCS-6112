package cn.anxcyun.www.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class updatePatientInformation extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("testtest");

		HttpSession session = req.getSession();
		String patientEmail = (String)session.getAttribute("userEmail");	
		System.out.println(patientEmail);
		String address = new String(req.getParameter("address").getBytes("iso-8859-1"), "utf-8");
		String telephoneNumber = new String(req.getParameter("telephoneNumber").getBytes("iso-8859-1"), "utf-8");
		String gender = new String(req.getParameter("gender").getBytes("iso-8859-1"), "utf-8");
		String birthday = new String(req.getParameter("birthday").getBytes("iso-8859-1"), "utf-8");
		String medicalHistory = new String(req.getParameter("medicalHistory").getBytes("iso-8859-1"), "utf-8");

		ServiceUser serviceUser = new ServiceUser();
		Patients patient =new Patients();
		
		patient.setEmail(patientEmail);
		patient.setAddress(address);
		patient.setTelephoneNumber(telephoneNumber);
		patient.setGender(gender);
		patient.setbirthDate(birthday);
		patient.setMedicalHistory(medicalHistory);


		String JDBCInfo = "error";
		boolean flag = serviceUser.updatePatientInformation(patient);
		if(flag) req.getRequestDispatcher("savesuccess.jsp").forward(req, resp);
		else req.getRequestDispatcher("savefailed.jsp").forward(req, resp);
			System.out.println(flag);
		
	}

}

