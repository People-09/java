package com.product.service;

import java.util.ArrayList;

import com.product.Model.Electronics;

public class ServiceImp {

	public static void displayAllSection()
	{
		ProductService service = new ProductService();
		 ArrayList<Electronics>  electronics=service.displayElectItem();
		for(Electronics e:electronics)
		{
			System.out.println(e.getPid()+"  "+e.getName()+"  "+e.getCost()+"  "+e.getQuant());
		}
	}
}
