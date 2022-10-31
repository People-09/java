package com.pg.pc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void updateData()
	{
		System.out.println("Enter your id to update");
		int id;
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1111","root","root");
	        Statement statement=connection.createStatement();
	        String query="UPDATE student SET name='saritha',java=69 WHERE id=4";
	         statement.executeUpdate(query);
	         System.out.println("Data updated successfully..!!!");
	        }
	        catch (Exception e)  
	        {
	        	e.printStackTrace();
			}
	}
}

