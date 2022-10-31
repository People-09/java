package com.pg.pc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
      
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection =DriverManager.getConnection("jdbc:mysql://");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
