package org.kodnest.hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
		Student s1 = new Student(101, "Arjun", 65);
		Student s2 = new Student(102, "Dhruv", 95);
		Student s3 = new Student(103, "Chiru", 75);

		Bike b1 = new Bike(1602, "Yamaha", 220000.00);
		Bike b2 = new Bike(1408, "KTM", 250000.00);
		Bike b3 = new Bike(4052, "Triumph", 650000.00);

		// 1. Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2. Build SessionFactory using configuration
		SessionFactory factory = cfg.buildSessionFactory();

		// 3. Open Session using SessionFactory
		Session session = factory.openSession();

		// 4. Begin Transaction using session
		Transaction txn = session.beginTransaction();

		session.save(s1);
		session.save(s2);
		session.save(s3);

		session.save(b1);
		session.save(b2);
		session.save(b3);

		// 5. Commit the Transaction
		txn.commit();
		System.out.println("---> " + s1 + " has been stored in the Database");
		System.out.println("---> " + s2 + " has been stored in the Database");
		System.out.println("---> " + s3 + " has been stored in the Database");

		System.out.println("---> " + b1 + " has been stored in the Database");
		System.out.println("---> " + b2 + " has been stored in the Database");
		System.out.println("---> " + b3 + " has been stored in the Database");
    }
}
