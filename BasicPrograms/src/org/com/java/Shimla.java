package org.com.java;

import java.util.Scanner;

public class Shimla {
       public static void main(String args[])
       {
              
              Scanner sc= new Scanner(System.in);
              System.out.println("Please enter the location of the hotel");
              System.out.println("select  hotel 1 for shimla");
              System.out.println("select hotel 2 for mumbai 1");
              int num=sc.nextInt();
              switch(num)
              {
              case 1: 
                     System.out.println("hotel 1 is selected : ABC");
                     Scanner scan= new Scanner(System.in);
                     System.out.println("enter the number of children:");
                     int child=scan.nextInt();
                     System.out.println("enter the  child age:");
                     int childAge=scan.nextInt();
                     System.out.println("enter the number of adult:");
                     int adult=scan.nextInt();
                     System.out.println("enter the  adult age:");
                     int adultAge=scan.nextInt();
                     if(adultAge>10)
                     {
                           System.out.println("no.of adults: "+adult);
                           
                           if(childAge<10)
                           {
                                  System.out.println("no.of childs: "+child);
                           }
                     }
              
                     Scanner scan1= new Scanner(System.in);
                     System.out.println("choose your room if Ac enter 1  :");
                     System.out.println("choose your room if non-Ac enter 2   :");
                     int n,price;
                     int num1=scan1.nextInt();
                     switch(num1)
                     {
                     case 1:
                           System.out.println(" you have choosen AC room  for :3000");
                           System.out.println("view of thr room is waterfalls");
                           if(child>2)
                           {
                           if(child%2==0)
                           {
                                  n=child/2;
                                  System.out.println("Number of rooms ="+n);
                                  System.out.println("cost of  rooms = "+(price=n*3000));
                           }
                           }
                           if(adult>2)
                           {
                           if(adult%2==0)
                           {
                                  n=adult/2;
                                  System.out.println("Number of rooms ="+n);
                                  System.out.println("cost of  rooms = "+(price=n*3000));
                           }
                           }
                           break;
                           
                     case 2:
                           System.out.println(" you have choosen nonAC room for:2500" );
                           System.out.println("view of the room is park area ");
                           if(child>2)
                           {
                           if(child%2==0)
                           {
                                  n=child/2;
                                  System.out.println("Number of rooms ="+n);
                                  System.out.println("cost of  rooms = "+(price=n*2500));
                           }
                           }
                           if(adult>2)
                           {
                           if(adult%2==0)
                           {
                                  n=adult/2;
                                  System.out.println("Number of rooms ="+n);
                                  System.out.println("cost of  rooms = "+(price=n*2500));
                           }
                           }
                           break;
                           default:
                                  System.out.println("no room are choosen");
                     }
                     
                     
                     break;
              case 2: 
                  System.out.println("hotel 2 is selected : XYZ");
                  Scanner scan0= new Scanner(System.in);
                  System.out.println("enter the number of children:");
                  int childs=scan0.nextInt();
                  System.out.println("enter the  child age:");
                  int childsAge=scan0.nextInt();
                  System.out.println("enter the number of adult:");
                  int adults=scan0.nextInt();
                  System.out.println("enter the  adult age:");
                  int adultsAge=scan0.nextInt();
                  if(adultsAge>10)
                  {
                        System.out.println("no.of adults: "+adults);
                        
                        if(childsAge<10)
                        {
                               System.out.println("no.of childs: "+childs);
                        }
                  }
           
                  Scanner scan2= new Scanner(System.in);
                  System.out.println("choose your room if Ac enter 1  :");
                  System.out.println("choose your room if non-Ac enter 2   :");
                  int m,prices;
                  int num2=scan2.nextInt();
                  switch(num2)
                  {
                  case 1:
                        System.out.println(" you have choosen AC room  for :3000");
                        System.out.println("view of the room is park area ");
                        if(childs>2)
                        {
                        if(childs%2==0)
                        {
                               m=childs/2;
                               System.out.println("Number of rooms ="+m);
                               System.out.println("cost of  rooms = "+(price=m*3000));
                        }
                        }
                        if(adults>2)
                        {
                        if(adults%2==0)
                        {
                               m=adults/2;
                               System.out.println("Number of rooms ="+m);
                               System.out.println("cost of  rooms = "+(price=m*3000));
                        }
                        }
                        break;
                        
                  case 2:
                        System.out.println(" you have choosen nonAC room for:2500" );
                        System.out.println("view of the room is mountains");
                        if(childs>2)
                        {
                        if(childs%2==0)
                        {
                               m=childs/2;
                               System.out.println("Number of rooms ="+m);
                               System.out.println("cost of  rooms = "+(price=m*2500));
                        }
                        }
                        if(adults>2)
                        {
                        if(adults%2==0)
                        {
                               m=adults/2;
                               System.out.println("Number of rooms ="+m);
                               System.out.println("cost of  rooms = "+(price=m*2500));
                        }
                        }
                        break;
                        default:
                               System.out.println("no room are choosen");
                  }
                  
                  
              }
       }
}
