<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'attendenceresult.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	
  </head>
  
  <body>
  <%@ page import="in.apcfss.service.CRUDOPerations" %>
    <%@ page import="in.apcfss.dto.Employee" %>
	<%
	String status=null;
	List<Employee> employeesList = null;
	try{
			status = CRUDOPerations. dayspresent(request, response);
			//employeesList=CRUDOPerations.slipEmployee(request,response); 
			//request.setAttribute("statusemployeesList", employeesList);
			//out.println(status);
			if("success...".equals(status)){
				out.println("<div class='alert alert-success'><strong>Success!</strong>Employee attendence details updated successfully <a href='viewEmployee' class='alert-link'>click here for view employee page</a><a href='#' class='alert-link'> click here for home page</a>.</div>");
				

			 }else{
			 	out.println("<div class='alert alert-danger'><strong>failure!</strong> Failed to add attendence of Employee deatils may be due to you already entered the attendence details<a href='viewEmployee' class='alert-link'> click here for view employee page</a>.<a href='#' class='alert-link'> click here for home page</a>.</div>");

			 }
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("exception cathedc for add attendence employee");
		}
				
	%>
  </body>
</html>
