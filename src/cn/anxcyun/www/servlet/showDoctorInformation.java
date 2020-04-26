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

public class showDoctorInformation extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String patientEmail = (String)session.getAttribute("userEmail");
		System.out.println("test111");
		System.out.println(patientEmail);
		ServiceUser serviceUser = new ServiceUser();
		String JDBCInfo = "error";

		Doctor doctor = serviceUser.getDoctorFromCare(patientEmail).get(0);
		req.setAttribute("doctor", doctor);
		req.getRequestDispatcher("showDoctorInformation.jsp").forward(req, resp);

		System.out.println("success");
		
	}

}

