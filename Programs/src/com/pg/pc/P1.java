package com.pg.pc;
import java.util.Scanner;
public class P1 {
          public static int d,e1,e2,e3,e4,g1,g2,g3,g4,h1,h2,h3,h4,i1,i2,i3,i4;
		public void visibleToCustomer()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("***WELCOME TO VEGETABLE STORE***");
	        System.out.println("                    ");
	        System.out.println("Please select your vegetables..!!!");
	        System.out.println("Enter 1 to see vegetables list");
	        //System.out.println("Enter 2 to see vegetables final cost");
	        int num =sc.nextInt();
	        int p1;
			switch(num)
	        {
	            case 1:
	                  System.out.println("onions- available 50kg");
	                  System.out.println("Tomatoes-available 20kg");
	                  System.out.println("Potatoes-available 35kg");
	                  System.out.println("carrots-available 10kg");
	                  System.out.println("----------------------------");
	                  System.out.println("price of vegetables");
	                  System.out.println("onions/kg-100");
	                  System.out.println("Tomatoes/kg-50rs");
	                  System.out.println("Potatoes/kg-80rs");
	                  System.out.println("carrots/kg-60rs");
	                  System.out.println("-----------------------------");
	                  Scanner sc1 =new Scanner(System.in);
	                  System.out.println("select your vegetables");
	                   System.out.println("1 for onlions,2 for Tomatoes,3 for Potatoes,4 for carrots");
	                  int a=sc1.nextInt();
	                  System.out.println("enter your kgs");
	                  int kg=sc1.nextInt();
	                  System.out.println(" your kgs : "+ kg);               
	                  if(a==1)
	                  {
	                      int cost=100;
	                      int p11 = cost*kg;
	                      System.out.println("onions/kg : "+p11);
	                     // d=p11*cost;
	                      e1=p11;
	                  }
	                  if(a==2)
	                  {
	                      int cost1=50;
	                      int p2 = cost1*kg;
	                      System.out.println("Tomatoes/kg : "+p2);
	                     // d=p2*cost1;
	                      e2=p2;
	                  }
	                  if(a==3)
	                  {
	                      int cost2=80;
	                      int p3 = cost2*kg;
	                     System.out.println("Potatoes/kg : "+p3);
	                    // d=p3*cost2;
	                      e3=p3;
	                  }
	                  if(a==4)
	                  {
	                     int cost3=sc1.nextInt();
	                     int p4 = 60;
	                     System.out.println("carrots/kg : "+p4);
	                     //d=p4*cost3;
	                      e4=p4;
	                  }
	                  System.out.println("------------------------------------------------------------");
                  System.out.println("enter your another vegetable");
                  System.out.println("1 for onlions,2 for Tomatoes,3 for Potatoes,4 for carrots");
                  int b=sc1.nextInt();
                  System.out.println("enter your kgs");
                  int kgs=sc1.nextInt();
                  System.out.println(" your kgs : "+ kgs);               
                  if(b==1)
                  {
                      int cost=100;
                      int q1 = cost*kgs;
                      System.out.println("onions/kg : "+q1);
                      //d=q1*cost;
                      g1=q1;
                  }
                  if(b==2)
                  {
                      int cost1=50;
                      int q2 = cost1*kgs;
                      System.out.println("Tomatoes/kg : "+q2);
                    //  d=q2*cost1;
                      g2=q2;
                  }
                  if(b==3)
                  {
                      int cost2=80;
                      int q3 = cost2*kgs;
                     System.out.println("Potatoes/kg : "+q3);
                    // d=q3*cost2;
                     g3=q3;
                  }
                  if(b==4)
                  {
                     int cost3=60;
                     int q4 = cost3*kgs;
                     System.out.println("carrots/kg : "+q4);
                   // d=q4*cost3;
                     g4=q4;
                  }
                  
	                  System.out.println("------------------------------------------------------------");
	                  System.out.println("enter your another vegetable");
	                  System.out.println("1 for onlions,2 for Tomatoes,3 for Potatoes,4 for carrots");
	                  int c=sc1.nextInt();
	                  System.out.println("enter your kgs");
	                  int kgss=sc1.nextInt();
	                  System.out.println(" your kgs : "+ kgss);               
	                  if(c==1)
	                  {
	                      int cost=100;
	                      int r1 = cost*kgss;
	                      System.out.println("onions/kg : "+r1);
	                    //  d=r1*cost;
	                      h1=r1;
	                  }
	                  if(c==2)
	                  {
	                      int cost1=50;
	                      int r2 = cost1*kgss;
	                      System.out.println("Tomatoes/kg : "+r2);
	                     // d=r2*cost1;
	                      h2=r2;
	                  }
	                  if(c==3)
	                  {
	                      int cost2=80;
	                      int r3 = cost2*kgss;
	                     System.out.println("Potatoes/kg : "+r3);
	                    // d=r3*cost2;
	                      h3=r3;
	                  }
	                  if(c==4)
	                  {
	                     int cost3=60;
	                     int r4 = cost3*kgss;
	                     System.out.println("carrots/kg : "+r4);
	                   // d=r4*cost3;
	                      h4=r4;
	                  }
	                  System.out.println("-------------------------------------------------------------");
	                  System.out.println("enter your another vegetable");
	                  System.out.println("1 for onlions,2 for Tomatoes,3 for Potatoes,4 for carrots");
	                  int f=sc1.nextInt();
	                  System.out.println("enter your kgs");
	                  int kgsss=sc1.nextInt();
	                  System.out.println(" your kgs : "+ kgsss);               
	                  if(f==1)
	                  {
	                      int cost=100;
	                      int s1 = cost*kgsss;
	                      System.out.println("onions/kg : "+s1);
	                     // d=s1*cost;
	                      i1=s1;
	                  }
	                  if(f==2)
	                  {
	                      int cost1=50;
	                      int s2 = cost1*kgsss;
	                      System.out.println("Tomatoes/kg : "+s2);
	                      //d=s2*cost1;
	                      i2=s2;
	                  }
	                  if(f==3)
	                  {
	                      int cost2=80;
	                      int s3 = cost2*kgsss;
	                     System.out.println("Potatoes/kg : "+s3);
	                   //  d=s3*cost2;
	                      i3=s3;
	                  }
	                  if(f==4)
	                  {
	                     int cost3=60;
	                     int s4 = cost3*kgsss;
	                     System.out.println("carrots/kg : "+s4);
	                    //  d=s4*cost3;
	                      i4=s4;
	                  }
	                  {
	                      System.out.println("select 2 for totol amount");
	                  }
	            case 2:
	                   {
	                       System.out.println("you select for totol bill");
	                       int price1=(e1+e2+e3+e4);
	                    		   int price2=(g1+g2+g3+g4);
	                    		   int price3=(h1+h2+h3+h4);
	                    		   int price4=(i1+i2+i3+i4);
	                    		   int sum=price1+price2+price3+price4;
	                    		 System.out.println("Bill amount : "+ sum);
	                    		 System.out.println("***********THANK YOU FOR SHOPPING******************");
	                   }
	                   
	                  break;
	        }
	    }
		
	    public static void main(String[]args)
	    {
	        P1 p = new P1();
	        p.visibleToCustomer();
	    }


}

