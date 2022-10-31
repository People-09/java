package com.ass.Service;

import java.util.ArrayList;

import com.ass.Model.Employee;

public class EmpServiceImp {
	
	public static void display()
	{
		EmpService service = new EmpService();
		ArrayList<Employee> employee=service.displayEmployee( );
		
		
	}

}
