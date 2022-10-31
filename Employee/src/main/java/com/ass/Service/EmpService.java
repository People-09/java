package com.ass.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.ass.Connection.ConnectionFactory;
import com.ass.Model.Employee;
import com.ass.dao.EmpDao;

public class EmpService implements EmpDao
{


	public ArrayList<Employee> displayEmployee() {

	ArrayList<Employee> list=new ArrayList<Employee>();

	try
	{			
		Connection con= ConnectionFactory.getConnection();
		Statement statement = con.createStatement();
		ResultSet set= statement.executeQuery("SELECT * FROM `2222`.employee;");
		while(set.next())
		{
			Employee employee2 = new Employee();
			employee2.setId(set.getInt(1));
			employee2.setName(set.getString(2));
			employee2.setAdd(set.getString(3));
			employee2.setPwd(set.getInt(4));
            list.add(employee2);
      
		}
	}
	catch (Exception e)
	{
		System.out.println(e);	
   }
	return list;
	
	}

	public  ArrayList<Employee> addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		try
		{
 			
			Connection con=ConnectionFactory.getConnection();
			Statement statement=con.createStatement();
			statement.executeUpdate("insert  into employee(`name`,`password`) values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getAdd()+"','"+employee.getPwd()+"')");
			
		}
 		
		catch (Exception e)
		{
			System.out.println(e); 
		}
		return list;

		
	}

	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Employee> addEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Employee> displayEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}



}