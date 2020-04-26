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

public class ShowPatientList extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		JSONArray arrayObj = null;
		ServiceUser serviceUser = new ServiceUser();

		ArrayList<Patients> patientList = null;
		ArrayList<String> patientInfoList = new ArrayList<String>();
		HttpSession session = req.getSession();
		String temp = (String)session.getAttribute("userEmail");
		System.out.println(temp);
		try {

			patientList = serviceUser.getPatientsListFromDb(temp);
			for(Patients d:patientList) {
				patientInfoList.add(d.toString());
			}
			if(patientList != null && patientList.size() > 0) {				

				System.out.println("Total Employee Records Fetch From Db Are?= " + patientList.size());

			} else {

				System.out.println("No Employee Records Are Present In Db");

			}

			System.out.println("test");
			System.out.println(patientList.toString());
			arrayObj = new JSONArray(patientList);
			req.setAttribute("patients", patientList);
			req.getRequestDispatcher("PatientsList.jsp").forward(req, resp);

			/***** Preparing The Output Response *****/


		} catch (IOException ex) {
			System.out.println("Wrong");
			ex.printStackTrace();

		}
		
	}

}

