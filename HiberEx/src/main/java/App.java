import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args)  {
		 Configuration configuration = new Configuration();
	        configuration.configure().addAnnotatedClass(Example.class);
	        System.out.println("Works");
	        SessionFactory factory = configuration.buildSessionFactory();
	        Session session = factory.openSession();
	       Example example = new Example();
	        session.beginTransaction();         
	        example.setId(2);
	        example.setName("abc");
	        session.save(example);
	        System.out.println("Data Inserted Successufully..!!");
	        session.beginTransaction().commit();

	}
}
