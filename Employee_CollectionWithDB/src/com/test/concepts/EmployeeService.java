package com.test.concepts;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.test.connect.ConnectionFactory;

public class EmployeeService implements EmployeeDao
{

	@Override
	public ArrayList<Employee>  displayEmployee() {
		
		ArrayList<Employee> list=new ArrayList<Employee>();

 
		Connection connection = ConnectionFactory.getConnection();
        try {
        	System.out.println("");
            Statement statement = connection.createStatement();
            ResultSet re =statement.executeQuery("SELECT * FROM `2222`.employees;");
            while (re.next()) {
                System.out.print(re.getInt(1)+"    ");
                System.out.print(re.getString(2)+"   ");
                System.out.println(re.getString(3)+" ");
                } 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return list;        
    }
	
	@Override
	public  ArrayList<Employee> addEmployee(Employee employee) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();

 		try
		{
 			
			Connection con=ConnectionFactory.getConnection();
			Statement statement=con.createStatement();
			
			statement.executeUpdate("insert  into employees(`name`,`password`) values('"+employee.getUsername()+"','"+employee.getPassword()+"')");
		}
 		
		catch (Exception e)
		{
			System.out.println(e); 
		}
		return list;
	}

	@Override
	public  ArrayList<Employee> updateEmployee(Employee employee) {
		ArrayList<Employee> list=new ArrayList<Employee>();

		 try
	        {    
	            Connection con=ConnectionFactory.getConnection();
	            Statement statement=con.createStatement();
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter userid to update : ");
	            int id = sc.nextInt();
	            System.out.println("Enter new Password for user : ");
	            String pass = sc.next();
	            String q = "update `2222`.`employees` set `password` = '"+pass+"' where id = '"+id+"'";
	            statement.executeUpdate(q);
	            System.out.println("Password updated sucessfully");
	        }
	         
	        catch (Exception e)
	        {
	            System.out.println(e);
	        }
		return list;
		
	        
	}
	public  ArrayList<Employee> deleteEmployee( Employee employee) 
	{
		ArrayList<Employee> list=new ArrayList<Employee>();

		try
        {    
            Connection con=ConnectionFactory.getConnection();
            Statement statement=con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter userid to delete: ");
            int id = sc.nextInt();
            String q = "delete from `2222`.`employees` WHERE id = '"+id+"'";
            statement.executeUpdate(q);
            System.out.println("Data deleted from the database");
        }
         
        catch (Exception e)
        {
            System.out.println(e);
        }
		return list;
	}
}


