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

public class updateMeasureData extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("testtest");

		HttpSession session = req.getSession();
		String patientEmail = (String)session.getAttribute("userEmail");	
		System.out.println(patientEmail);
		String date = new String(req.getParameter("date").getBytes("iso-8859-1"), "utf-8");
		String height = new String(req.getParameter("height").getBytes("iso-8859-1"), "utf-8");
		String weight = new String(req.getParameter("weight").getBytes("iso-8859-1"), "utf-8");
		String bloodPressure = new String(req.getParameter("bloodPressure").getBytes("iso-8859-1"), "utf-8");
		String bloodSugar = new String(req.getParameter("bloodSugar").getBytes("iso-8859-1"), "utf-8");
		String temp = new String(req.getParameter("temp").getBytes("iso-8859-1"), "utf-8");

		ServiceUser serviceUser = new ServiceUser();
		Patients patient =new Patients();

		String JDBCInfo = "error";
		boolean flag = serviceUser.updateMeasureData(date,patientEmail,height,weight,bloodPressure,bloodSugar,temp);
		if(flag) req.getRequestDispatcher("savesuccess.jsp").forward(req, resp);
		else req.getRequestDispatcher("savefailed.jsp").forward(req, resp);

			System.out.println(flag);
		
	}

}

