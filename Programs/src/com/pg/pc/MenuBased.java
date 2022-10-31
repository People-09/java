package com.pg.pc;

import java.util.Scanner;

public class MenuBased {

	public static void main(String[] args) {
		
		System.out.println("what you want to perform?");
		System.out.println("1---> Display");
		System.out.println("2---> Insert");
		System.out.println("3---> Delete");
		System.out.println("4---> Update");
		int choice;
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		
		if(choice==1)
		{
			Student.displayData();
		}
		else if(choice==2)
		{
			InserValueInDb.insertData();
		}
		else if(choice==3)
		{
			DeleteData.deleteData();
		}
		else if (choice==4)
		{
			Update.updateData();
		}
	}
}
