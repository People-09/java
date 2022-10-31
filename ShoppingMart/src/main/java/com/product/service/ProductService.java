package com.product.service;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.java.ConnectionTest.ConnectionFactory;
import com.product.dao.CartDAO;
import com.product.dao.CustomerDao;
import com.product.Model.Cloth;
import com.product.Model.Electronics;

public class ProductService implements CartDAO,CustomerDao
{

	public ArrayList<Electronics>  displayElectItem()
	{
		ArrayList<Electronics> list=new ArrayList<Electronics>();

		try
		{			
			Connection con= ConnectionFactory.getConnection();
			Statement statement = con.createStatement();
			ResultSet set= statement.executeQuery("SELECT * FROM product_info.electronicsection;");
			while(set.next())
			{
				Electronics electronics= new Electronics();
				electronics.setPid(set.getInt(2));
				electronics.setName(set.getString(3));
				electronics.setCost(set.getFloat(5));
				electronics.setQuant(set.getInt(6));
                list.add(electronics);
               
        		
			}
			 return list;
		}
		catch (Exception e) {
			System.out.println(e);	
	}
		return list;
		
	}
	public void buyElectItem(Electronics electronics) {
		
		try
		{
			
		}
		catch (Exception e) 
		{
			System.out.println(e);	
	    }

	}

	public void buyClothItem(Cloth cloth) {
		try
		{
			
		}
		catch (Exception e) 
		{
			System.out.println(e);	
		
	}
	}
	
	public int totalElectronic() {
		// TODO Auto-generated method stub
		return 0;
	}
}
