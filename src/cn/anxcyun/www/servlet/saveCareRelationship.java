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

public class saveCareRelationship extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String patientEmail = (String)session.getAttribute("userEmail");
		System.out.println(patientEmail);

		String doctorEmail = (String)req.getParameter("radiobutton");
		System.out.println(doctorEmail);
		
		
		
		ServiceUser serviceUser = new ServiceUser();
		
		boolean flag1 = serviceUser.checkPatientInCarerRelationship(patientEmail);

		String JDBCInfo = "error";
		if(flag1 == false) {
			boolean flag = serviceUser.saveCareRelationship(doctorEmail, patientEmail);
		    if(flag) {
			    System.out.println("success");
				req.getRequestDispatcher("savesuccess.jsp").forward(req, resp);

		    }
		    else {
			    System.out.println("error");
				req.getRequestDispatcher("savefailed.jsp").forward(req, resp);

		    }
		} else {
			boolean flag = serviceUser.updateCareRelationship(doctorEmail, patientEmail);
		    if(flag) {
			    System.out.println("success");
				req.getRequestDispatcher("savesuccess.jsp").forward(req, resp);
		    }
		    else {
			    System.out.println("error");
				req.getRequestDispatcher("savefailed.jsp").forward(req, resp);
		    }

		}
		
	}

}

