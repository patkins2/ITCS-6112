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

public class addPatientServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = new String(req.getParameter("email").getBytes("iso-8859-1"), "utf-8");
		String username =new String(req.getParameter("username").getBytes("iso-8859-1"), "utf-8");
		String password = new String(req.getParameter("password").getBytes("iso-8859-1"), "utf-8");
		ServiceUser serviceUser = new ServiceUser();
		Patients user =new Patients();
		
		//赋值初始化
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		
		
		//调用函数
		boolean flag = serviceUser.InsertPatients(user);
		String JDBCInfo = "error";
		if(flag) {
			List<Patients> list = serviceUser.patientList();
			req.setAttribute("list", list);
			req.getRequestDispatcher("hello.jsp").forward(req, resp);
			System.out.println("成功");
		}
		else {
			resp.getWriter().write(JDBCInfo);
			System.out.println("error");
		}
	}

}
