package cn.anxcyun.www.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;

public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = new String(req.getParameter("email").getBytes("iso-8859-1"), "utf-8");
		String username =new String(req.getParameter("username").getBytes("iso-8859-1"), "utf-8");
		String password = new String(req.getParameter("psw").getBytes("iso-8859-1"), "utf-8");
		String select = new String(req.getParameter("RadioGroup1").getBytes("iso-8859-1"), "utf-8");
		
		ServiceUser serviceUser = new ServiceUser();

		Doctor doctor = new Doctor();
		Patients patients = new Patients();		
		
		//∏≥÷µ≥ı ºªØ
		if(select.equals("1")) {
			doctor.setEmail(email);
			doctor.setUsername(username);
			doctor.setPassword(password);

			boolean flag1 = serviceUser.checkDoctor(email);
			boolean flag = false;
			if(flag1) { flag = serviceUser.InsertDoctor(doctor);}
			String JDBCInfo = "You are not in the doctors' email list.";
			if(flag) {
				//if(doctor.getStatus() == false) {
				    req.getRequestDispatcher("doctorsignupsuccess.jsp").forward(req, resp);
				    //doctor.setStatus(true);
				    System.out.println("success");
				//} else JDBCInfo = "You already registeres for an account, please login";
			}
			else {
				resp.getWriter().write(JDBCInfo);
				System.out.println("error");
			}
		}
		
		if(select.equals("2")) {
			boolean flag1 = serviceUser.checkDoctor(email);
			if(flag1) {
				String JDBCInfo = "error: you can not sign up for a user account with a doctor's email";
			    resp.getWriter().write(JDBCInfo);

			} else {
			    patients.setEmail(email);
			    patients.setUsername(username);
			    patients.setPassword(password);
			
			    boolean flag = serviceUser.InsertPatients(patients);
			    String JDBCInfo = "error: your e-mail has already signed up, please login";
			    if(flag) {
				    req.getRequestDispatcher("patientsignupsuccess.jsp").forward(req, resp);
				    System.out.println("success");
			    }
			    else {
				    resp.getWriter().write(JDBCInfo);
				    System.out.println("error");
			    }
			}
		} 
	}
}

