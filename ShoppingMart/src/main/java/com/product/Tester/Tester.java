package com.product.Tester;

import com.product.service.CustomerService;
import com.product.service.ServiceImp;

public class Tester {

	public static void main(String[] args) {
		
		 CustomerService customerService= new CustomerService();
		float finalbill= customerService.totalElectronic();
		System.out.println("Final Bill :"+finalbill);
	} 

}
