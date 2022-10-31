package com.product.service;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.java.ConnectionTest.ConnectionFactory;
import com.product.Model.Electronics;
import com.product.dao.CustomerDao;

public class CustomerService implements CustomerDao
{
	float bill=0;

	public float totalElectronic() {
     	Scanner sc= new Scanner(System.in);
        String cusname=sc.next();
		
		System.out.println("Electronic section");
		ProductService service = new ProductService();
		 ArrayList<Electronics>  electronics=service.displayElectItem();
		 System.out.println(electronics.size());
		 float cost[]=new float[electronics.size()];
		 String name[]=new String[electronics.size()];
		 int prId[]=new int[electronics.size()];
		 int i=0;
		 for(Electronics e:electronics)
			{
			   cost[i]=e.getCost();
			   name[i]=e.getName();
			   prId[i]=e.getPid();
			//	System.out.println(e.getPid()+"  "+e.getName()+"  "+e.getCost()+"  "+e.getQuant());
			   i++;
			}
         	
		 for(int j=0;j<electronics.size();j++)
		 {
            System.out.println(prId[j]+"   "+cost[j]+"   "+name[j]);
	 }
		 int choice,quantity ;
		 for(int j=0;j<electronics.size();j++)
		 {
		 System.out.println("would you like to purchese  "+name[j] + "\n 1 for yes 2 for no ");
		 choice=sc.nextInt();
		 if(choice==1)
		 {
			 System.out.println(" How many you want  ??");
			 quantity =sc.nextInt();
			 bill=bill+cost[j]*quantity;
		 }
		 }
		 try
		 {
			 	Connection connection= ConnectionFactory.getConnection();
			 	Statement statement=connection.createStatement();
			 	statement.executeQuery("insert into customer(`name`,`billq`) values('"+cusname+"','"+bill+"'");
		 }
		 catch (Exception e) {
			System.out.println(e);		
			}
		return bill;
	}

	 

}
