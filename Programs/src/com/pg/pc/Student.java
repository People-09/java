package com.pg.pc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
 public static void displayData() {
	 int total[] =new int[10];
	 String name[]=new String[10];
	 int i=0;
	 
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/1111","root","root");
	System.out.println("connection success  ");
	Statement statement=connection.createStatement();
	ResultSet set=statement.executeQuery("select * from student");
	while(set.next())
	{
		System.out.println(set.getString(2) +" "+ set.getInt(3) + " "+set.getInt(4) +" "+ set.getInt(5));
		name[i]=set.getString(2);
		total[i]=set.getInt(3)+set.getInt(4)+set.getInt(5);
		i++;
	}
	for(i=0;i<5;i++)
	{
		System.out.println(name[i]+" scored "+total[i]);
	}
//	int top=0,pos=0;
//	for(i=0;i<4;i++)
//	{
//		if(total[i]>total[i+1])
//		{
//			top=total[i];
//			break;
//		}
//	}
//	System.out.println(name[i]+" scored best");
   }
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}