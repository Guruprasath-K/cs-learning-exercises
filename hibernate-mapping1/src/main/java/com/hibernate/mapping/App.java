package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		// Bike b1 = new Bike(111, "KTM", 150000, s1);
		// Bike b2 = new Bike(222, "Yamaha", 200000, s3);
		// Bike b3 = new Bike(333, "Royal Enfield", 250000, s2);

		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();

		Students s1 = new Students(01, "Ravi", 35, b3);
		Students s2 = new Students(02, "Raghu", 45, b1);
		Students s3 = new Students(03, "Rohan", 55, b2);

		b1.setRegNum(111);
		b1.setModel("KTM");
		b1.setPrice(150000.00);
		b1.setStudents(s2);

		b2.setRegNum(222);
		b2.setModel("Yamaha");
		b2.setPrice(200000.00);
		b2.setStudents(s3);

		b3.setRegNum(333);
		b3.setModel("Royal Enfield");
		b3.setPrice(150000.00);
		b3.setStudents(s1);

		// 1. Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2. Build SessionFactory using configuration
		SessionFactory factory = cfg.buildSessionFactory();

		// 3. Open Session using SessionFactory
		Session session = factory.openSession();

		// 4. Begin Transaction using session
		Transaction txn = session.beginTransaction();

		session.save(b1);
		session.save(b2);
		session.save(b3);

		session.save(s1);
		session.save(s2);
		session.save(s3);

		// 5. Commit the Transaction
		txn.commit();

		System.out.println("-----> DONE <-----");
		;
	}

}
