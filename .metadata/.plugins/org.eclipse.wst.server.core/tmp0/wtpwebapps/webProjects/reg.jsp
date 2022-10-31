<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String u=request.getParameter("un");
String p=request.getParameter("pwd");
String a=request.getParameter("add");
String z=request.getParameter("zip");


try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/1111","root","root");
Statement statement=co.createStatement();
String query="insert into login(`name`,`password`,`address`,`pin`) values('"+u+"','"+p+"','"+a+"','"+z+"')";
int i=0;
i=statement.executeUpdate(query);
if(i!=0)
{
	response.sendRedirect("login.html");
}
else
{
	response.sendRedirect("register.html");

}
}
catch (Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>