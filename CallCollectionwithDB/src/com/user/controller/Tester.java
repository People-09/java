package com.user.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.user.Model.Employee;

public class Tester {
public static void main(String[] args) {
	ArrayList< Employee> arrayList =new ArrayList();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1111","root","root");
		Statement statement=con.createStatement();
		ResultSet set=statement.executeQuery("select * from employee");
		 int i=0;
		while(set.next())
		{
			Employee employee = new Employee();
			employee.setName(set.getString(2));
			employee.setAdd(set.getString(3));
			employee.setZip(set.getString(4));
			employee.setId(set.getInt(1));
			i++;
			arrayList.add(employee);
		}
		for(Employee e:arrayList )
		{
			System.out.println(e.getName()+" "+e.getAdd()+" "+e.getZip()+" "+e.getId());
		}
	} 
	catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
