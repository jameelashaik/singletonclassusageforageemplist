package in.apcfss.controller;

import in.apcfss.service.CRUDOPerations;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/deleteEmployee")
public class DeleteEmployee extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		res.setContentType("text/html");  
		try{
			RequestDispatcher rd = req.getRequestDispatcher("/delete.jsp");
			rd.forward(req, res);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
