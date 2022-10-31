package in.py.ab;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		   
		   System.out.println("what type of insurance do you want");
		   System.out.println("enter 1 for vehicle insurance");
		    System.out.println("enter 2 for life insurance");
		    System.out.println("enter 3 for health insurance");
		    Scanner scan=new Scanner(System.in);
		    int a =scan.nextInt();
		    
		    int v=scan.nextInt();
		    Insurance i=new Insurance();
		    if(a==1)
		    {
		       i.vehicle();
		       if(v==1)
		       {
		    	   main(args);
		       }
		       else if(v==2)
		       {
		    	   System.out.println("..");
		       }
		    
		    }
		    else if(a==2)
		    {
		        i.health();
		    }
		    else if(a==3)
		    {
		        i.life();
		    }
		    else
		    {
		        System.out.println();
		    }
		
	}
}
