package com.pg.pc;

import java.util.Scanner;

public class Exceptions {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your numbers");
	int p,q,r;
	try
	{
		p=sc.nextInt();
		q=sc.nextInt();
		r=p+q;
		System.out.println(r);
	}
	catch (Exception e)
	{
		System.out.println("please do proper input "+e);
		Exceptions.main(args);
	}
}
}
