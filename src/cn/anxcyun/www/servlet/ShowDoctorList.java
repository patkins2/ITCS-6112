package cn.anxcyun.www.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.anxcyun.www.control.ServiceUser;
import cn.anxcyun.www.po.Doctor;
import cn.anxcyun.www.po.Patients;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

public class ShowDoctorList extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		JSONArray arrayObj = null;
		ServiceUser serviceUser = new ServiceUser();

		ArrayList<Doctor> doctorList = null;
		ArrayList<String> doctorInfoList = new ArrayList<String>();
		HttpSession session = req.getSession();
		String temp = (String)session.getAttribute("user");
		System.out.println(temp);
		try {

			doctorList = serviceUser.getDoctorListFromDb();
			for(Doctor d:doctorList) {
				doctorInfoList.add(d.toString());
			}
			System.out.println(doctorList.toString());
			arrayObj = new JSONArray(doctorList);
			req.setAttribute("doctors", doctorList);
			req.getRequestDispatcher("selectDoctor.jsp").forward(req, resp);

			/***** Preparing The Output Response *****/


		} catch (IOException ex) {
			System.out.println("Wrong");
			ex.printStackTrace();

		}
		
	}

}

