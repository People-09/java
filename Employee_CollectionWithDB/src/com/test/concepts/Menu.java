package com.test.concepts;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
	
		Menu.name();
	}
	public static void name() {
		System.out.println("---------------------------");
		System.out.println("what you want to perform?");
		System.out.println("1---> Insert");
		System.out.println("2---> Delete");
		System.out.println("3---> Update");
		System.out.println("4---> Display");	
		System.out.println("5---> exit");
		int choice;
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		if(choice==1)
		{
			Provider.addData();
           name();
		}
		else if(choice==2)
		{
			Provider.deleteData();
            name();
		}
		else if(choice==3)
		{
			Provider.updateData();
			name();
		}
		else if (choice==4)
		{
			Provider.displayData();
			name();
		}
	}
}
