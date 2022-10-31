package com.test.concepts;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
	
		Menu.name();
	}
	public static void name() {
		System.out.println("---------------------------");
		System.out.println("what you want to perform?");
		System.out.println("1---> Display");
		System.out.println("2---> Insert");
		System.out.println("3---> Delete");
		System.out.println("4---> Update");	
		System.out.println("5---> exit");
		int choice;
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		if(choice==1)
		{
			Provider.displayData();
           name();
		}
		else if(choice==2)
		{
			Provider.addData();
            name();
		}
		else if(choice==3)
		{
			Provider.deleteData();
			name();
		}
		else if (choice==4)
		{
			Provider.updateData();
			name();
		}
	}
}
