package p.q.r;

import java.sql.*;

public class ConnectionFactory {
 
	static Connection connection = null;

	public static Connection getConnection() {
		   try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/2222", "root", "root");
	            return connection;
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
		return connection ;
	}
	public static Connection getConnection1() {
		// TODO Auto-generated method stub
		return null;
	}
}
