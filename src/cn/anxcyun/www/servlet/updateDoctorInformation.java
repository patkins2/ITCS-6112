package cn.anxcyun.www.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class updateDoctorInformation extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("testtest");

		HttpSession session = req.getSession();
		String doctorEmail = (String)session.getAttribute("userEmail");	
		System.out.println(doctorEmail);
		
		String address = new String(req.getParameter("address").getBytes("iso-8859-1"), "utf-8");
		String telephoneNumber = new String(req.getParameter("telephoneNumber").getBytes("iso-8859-1"), "utf-8");
		String gender = new String(req.getParameter("gender").getBytes("iso-8859-1"), "utf-8");
		String introduction = new String(req.getParameter("introduction").getBytes("iso-8859-1"), "utf-8");
		
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		
		doctor.setEmail(doctorEmail);

		doctor.setAddress(address);
		doctor.setTelephoneNumber(telephoneNumber);
		doctor.setGender(gender);
		
		doctor.setIntroduction(introduction);
		
		String JDBCInfo = "error";
		boolean flag = serviceUser.updateDoctorInformation(doctor);
		if(flag) req.getRequestDispatcher("savesuccess.jsp").forward(req, resp);
		else req.getRequestDispatcher("savefaild.jsp").forward(req, resp);
		
			System.out.println(flag);
	}

}
