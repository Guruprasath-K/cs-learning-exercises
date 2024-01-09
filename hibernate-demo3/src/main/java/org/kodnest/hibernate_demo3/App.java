package org.kodnest.hibernate_demo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
		Employees emp1 = new Employees(101, "Ravi", 80000);
		Employees emp2 = new Employees(102, "Rishi", 75000);
		Employees emp3 = new Employees(103, "Rohan", 65000);

		Department dept1 = new Department(11, "Human Resource");
		Department dept2 = new Department(22, "Engineering");

		// 1. Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2. Build SessionFactory using configuration
		SessionFactory factory = cfg.buildSessionFactory();

		// 3. Open Session using SessionFactory
		Session session = factory.openSession();

		// 4. Begin Transaction using session
		Transaction txn = session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		session.save(emp3);

		session.save(dept1);
		session.save(dept2);

		// 5. Commit the Transaction
		txn.commit();

		System.out.println("---> " + emp1 + " has been stored in the Database");
		System.out.println("---> " + emp2 + " has been stored in the Database");
		System.out.println("---> " + emp3 + " has been stored in the Database");

		System.out.println("---> " + dept1 + " has been stored in the Database");
		System.out.println("---> " + dept2 + " has been stored in the Database");
    }

}
