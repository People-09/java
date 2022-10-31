package com.pg.pc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserValueInDb {
public static void insertData() {
	System.out.println("Enter your values");
	String name;
	int java,ds,db;
	Scanner sc=new Scanner(System.in);
	name=sc.next();
	java=sc.nextInt();
	ds=sc.nextInt();
	db=sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1111","root","root");
        Statement statement=connection.createStatement();
        String query="INSERT INTO `1111`.`student` (`name`, `java`, `ds`, `db`) VALUES ('"+name+"', '"+java+"', '"+ds+"', '"+db+"')";
         // String query="INSERT INTO `1111`.`userinformation` (`RollNo`, `Name`, `mobileNo`, `emailId`, `Address`) VALUES ('1', 'vani', '9877655454', 'vani9@gmail.com', 'rjy')";

         statement.executeUpdate(query);
         System.out.println("Inserted data successfully..!!!");
        }
        catch (Exception e)  
        {
        	e.printStackTrace();
		}
}
}
