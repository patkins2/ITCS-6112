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
/**
 * 
    * @ClassName: LoginServlet
    * @Description: ��½��servlet��
    * @author Anxc
    * @date 2019��8��22��
    *
 */
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.setCharacterEncoding("utf-8");
		//String name = req.getParameter("username");
		//String number  = req.getParameter("number");
		String email = new String(req.getParameter("email").getBytes("iso-8859-1"), "utf-8");
		String password = new String(req.getParameter("password").getBytes("iso-8859-1"), "utf-8");
		
		
		ServiceUser serviceUser = new ServiceUser();
		Doctor doctor =new Doctor();
		Patients patients =new Patients();
		
		//��ֵ��ʼ��
		doctor.setEmail(email);
		doctor.setPassword(password);
		patients.setEmail(email);
		patients.setPassword(password);
		//���ú���
		//boolean flag = serviceUser.checkDoctor(email);
		//boolean flag1 = false;
		//boolean flag2 = false;
		boolean flag1 = serviceUser.LoginDoctor(doctor);
		boolean flag2 = serviceUser.LoginPatients(patients);
		String JDBCInfo = "error";
		if(flag1) {
			List<Doctor> list = serviceUser.doctorList();
			req.setAttribute("list", list);
			req.getRequestDispatcher("doctorsigninsuccess.jsp").forward(req, resp);
			System.out.println("�ɹ�");
			
		}
		if(flag2) {
			List<Patients> list = serviceUser.patientList();
			req.setAttribute("list", list);
			req.getRequestDispatcher("patientsigninsuccess.jsp").forward(req, resp);
			System.out.println("�ɹ�");
		}
		if(!flag1 && !flag2) {
			req.setAttribute("flag", "0");
			req.getRequestDispatcher("signinfailed.jsp").forward(req, resp);
			System.out.println("error");
		}
		
	}

}

