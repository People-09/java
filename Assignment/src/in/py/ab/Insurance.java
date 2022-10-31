package in.py.ab;

import java.util.Scanner;
	public class Insurance implements InsurencePolicy 
	{
	    private int premium,a;
	    private String date;
	    private int tenure;
	    private double estCost;
	    public void vehicle() {
	    System.out.println("select 1 for premium");
	    System.out.println("select for 2 normal insurence");
	    Scanner sc = new Scanner(System.in);
	    int premium=sc.nextInt();
	       if(premium==1)
	        {
	            System.out.println("you selected the premium insurence");
	            System.out.println("Tenure is 2years ");
	            System.out.println("primium cost for month : 5000");
	            System.out.println("Estimation cost is 1,20,000");
	            System.out.println(" you want to continue select 1/no ");
            	int a=sc.nextInt();
	            
	        }
	        if(premium==2)
	        {
	            System.out.println("you selected the normal insurence");
	            System.out.println("Tenure is 4years ");
	            System.out.println("primium cost for month : 1500");
	            System.out.println("Estimation cost is 72000");
	        }
	    }
		@Override
		public void life() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void health() {
			// TODO Auto-generated method stub
			
		}


}
