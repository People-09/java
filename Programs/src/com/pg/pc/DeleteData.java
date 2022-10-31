package com.pg.pc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {
 
	public static void deleteData()
	{
		System.out.println("Enter your id to delete");
		int id;
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1111","root","root");
	        Statement statement=connection.createStatement();
	        String query="delete from `1111`.`student` where (id='"+id+"')";
	         statement.executeUpdate(query);
	         System.out.println("Data deleted successfully..!!!");
	        }
	        catch (Exception e)  
	        {
	        	e.printStackTrace();
			}
	}
	}
