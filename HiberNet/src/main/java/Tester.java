import java.util.ArrayList;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

	public class Tester {
		public static void main(String[] args)
	      {
			m1(); 
	      }
			public static void m1()
			{
			 Scanner sc1 = new Scanner(System.in);
		        System.out.println("Enter your choice   ");
		        System.out.println("choose 1 for Insert ");
		        System.out.println("choose 2 for Display");
		        System.out.println("choose 3 for Update");
		        System.out.println("choose 4 for Delete");
		        int choose = sc1.nextInt();
		        if (choose == 1)
		        {
		        Configuration configuration = new Configuration();
		        configuration.configure("HiberNet.cfg.xml");
		        System.out.println("Works");
		        SessionFactory factory = configuration.buildSessionFactory();
		        Session session = factory.openSession();
		        Students student = new Students();
		        session.beginTransaction();
		        student.setId(1);
		        student.setName("abc");
//		        student.setEmail("xyz@12");
//		        student.setAdd("hyd");
		        session.save(student);
		        System.out.println("Data Inserted Successufully..!!");
		        session.getTransaction().commit();
		        m1();
		    }
		        else if (choose == 2)
		        {
		            ArrayList<Students> list = new ArrayList<Students>();
		            Configuration configuration = new Configuration();
		            configuration.configure("HiberNet.cfg.xml");
		            System.out.println("works");
		            SessionFactory factory = configuration.buildSessionFactory();
		            Session session = factory.openSession();
		            Students student = new Students();
		            session.beginTransaction();
		            list=(ArrayList<Students>) session.createQuery("from Students",Students.class).list();
		            list.add(student);
		            System.out.println("id"+"\t"+"name");
		            for (Students student1 : list)
		            {
		                System.out.println(student1.getId()+"    "+student1.getName());
		            }
		            System.out.println("Data Displayed..!!");
		            session.getTransaction().commit();
		            m1();
		        }
		        else if(choose == 3)
		        {
		            Configuration configuration = new Configuration();
		            configuration.configure("HiberNet.cfg.xml");
		            System.out.println("works");
		            SessionFactory factory = configuration.buildSessionFactory();
		            Session session = factory.openSession();
		            Students student = new Students();
		            session.beginTransaction();
		            student = (Students)session.get(Students.class, 2);
		            student.setName("PQR");
		            System.out.println("Data Updated Successfully");
		            session.getTransaction().commit();
		            m1();
		        }
		        else if(choose == 4)
		        {
		            Configuration configuration = new Configuration();
		            configuration.configure("HiberNet.cfg.xml");
		            System.out.println("works");
		            SessionFactory factory = configuration.buildSessionFactory();
		            Session session = factory.openSession();
		            Students student = new Students();
		            session.beginTransaction();
		            student = (Students)session.load(Students.class, 1);
		            session.delete(student);
		            System.out.println("Data Deleted Successfully");
		            session.getTransaction().commit();
		            m1();
		        }
		        else
		            System.out.println("Enter the valid number");
		     
		}
	}
	