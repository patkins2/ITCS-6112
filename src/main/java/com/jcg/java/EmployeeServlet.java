package com.jcg.java;

import java.io.IOException;
import java.sql.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.google.gson.Gson;

@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/***** This Method Is Called By The Servlet Container To Process A 'GET' Request. 
	 * @throws IOException *****/
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			handleRequest(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, SQLException, IOException{

		JSONArray arrayObj = null;
		List<Doctors> doctorsList = null;
		
		Connection con = MyDb.connectDb();
		
		
		
		try {
			
			
			PreparedStatement ps = con.prepareStatement("insert into doctor values(?,?,?,?,?,?,?,?)");
			
			ps.setString(1, req.getParameter("string"));
			
			ps.executeUpdate();
			
			
			ps.close();
			con.close();
			/*
			 * **** Fetching Employee Records From The Database *****
			 *
			doctorsList = MyDb.getDoctorsListFromDb();
			if(doctorsList != null && doctorsList.size() > 0) {				
				System.out.println("Total Employee Records Fetch From Db Are?= " + doctorsList.size());
			} else {
				System.out.println("No Employee Records Are Present In Db");
			}

			arrayObj = new JSONArray(doctorsList);
			String jObj = new Gson().toJson(arrayObj);

			/***** Preparing The Output Response *****
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().write(jObj);
			*/
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}