package com.ass.Main;

import java.util.Scanner;

import com.ass.Model.Employee;
import com.ass.Service.EmpService;
import com.ass.Service.EmpServiceImp;

public class Menu {



	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("1---> Display");
		System.out.println("2---> Insert");
		System.out.println("3---> Delete");
		System.out.println("4---> Update");	
		System.out.println("5---> exit");
		int choice;
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		int a=sc.nextInt();
		EmpServiceImp emp = new EmpServiceImp();
		if(choice==1)
		{
			emp.display();
		}
		if(choice==2)
		{
		}

	}
	

}
