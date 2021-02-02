package in.apcfss.controller;

import in.apcfss.service.EmployeeReportsDao;

import in.apcfss.dto.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/agelist")
public class agelistemp extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html"); 
		PrintWriter pw =null;  
		try{
			pw=resp.getWriter();  
			System.out.println("checking servlet age emp list");
			EmployeeReportsDao obj = EmployeeReportsDao.getEmployeeReportsDao();
			EmployeeReportsDao obj1 = EmployeeReportsDao.getEmployeeReportsDao();
			System.out.println("checkingg obj--"+obj);
			System.out.println("checkingg obj1--"+obj1);
			@SuppressWarnings("static-access")
			List<Employee> ageemployeesList = obj.empagelist(req, resp); 
			System.out.println("age emp list---"+ageemployeesList);
//			if(ageemployeesList instanceof EmployeeReportsDao)
//			    System.out.println("Class is Singleton");
//			else
//			    System.err.println("Class not singleton");
			req.setAttribute("ageemployeesList", ageemployeesList);		
			RequestDispatcher rd = req.getRequestDispatcher("/viewageempresult.jsp");
			rd.forward(req, resp);

			System.out.println("checking servlet age emp list1...");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("exception cathedc for agelist employee");
		}
	}
}
