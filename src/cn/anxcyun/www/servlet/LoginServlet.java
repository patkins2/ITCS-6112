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

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.setCharacterEncoding("utf-8");
		//String name = req.getParameter("username");
		//String number  = req.getParameter("number");
		String email = new String(req.getParameter("email").getBytes("iso-8859-1"), "utf-8");
		String password = new String(req.getParameter("password").getBytes("iso-8859-1"), "utf-8");
		//String name = req.getParameter("username");
		HttpSession session = req.getSession();
		session.setAttribute("userEmail", email);
		
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		
		//赋值初始化
		doctor.setEmail(email);
		doctor.setPassword(password);
		patients.setEmail(email);
		patients.setPassword(password);

		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		String JDBCInfo = "error";
		if(flag1) {
			List<Doctor> list = serviceUser.doctorList();
			req.setAttribute("list", list);
			req.setAttribute("email", email);
			String name = "Anonymous";
			for(Doctor p:list) {
				 
				if (p.getEmail().equals(email)){
					System.out.println(p.getEmail());
					name = p.getUsername();
					break;
				}
			}
			req.setAttribute("name", name);
			req.getRequestDispatcher("doctorhomepage.jsp").forward(req, resp);

			System.out.println("成功");
			
		}
		if(flag2) {
			List<Patients> list = serviceUser.patientList();
			req.setAttribute("list", list);
			req.setAttribute("email", email);
			String name = "Anonymous";
			for(Patients p:list) {
				System.out.println(p.getEmail());
				if (p.getEmail().equals(email)){

					name = p.getUsername();
					break;
				}
			}
			req.setAttribute("name", name);
			req.getRequestDispatcher("patienthomepage.jsp").forward(req, resp);
			System.out.println("成功");
		}
		if(!flag1 && !flag2) {
			req.setAttribute("flag", "0");
			req.getRequestDispatcher("signinfailed.jsp").forward(req, resp);
			System.out.println("error");
		}
		
	}

}

