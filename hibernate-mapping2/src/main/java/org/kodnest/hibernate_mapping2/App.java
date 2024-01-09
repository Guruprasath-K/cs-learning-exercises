package org.kodnest.hibernate_mapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		List<Product> list1 = new ArrayList<Product>();
		list1.add(p1);
		list1.add(p2);

		List<Product> list2 = new ArrayList<Product>();
		list2.add(p3);
		list2.add(p4);

		Customer c1 = new Customer(01, "Amit", 21, list1);
		Customer c2 = new Customer(02, "Ankit", 23, list2);

		p1.setProdId(111);
		p1.setProdName("Keyboard");
		p1.setCost(1000);
		p1.setCustomer(c1);

		p2.setProdId(222);
		p2.setProdName("Mouse");
		p2.setCost(700);
		p2.setCustomer(c1);

		p3.setProdId(333);
		p3.setProdName("Television");
		p3.setCost(70000);
		p3.setCustomer(c2);

		p4.setProdId(444);
		p4.setProdName("Camera");
		p4.setCost(135000);
		p4.setCustomer(c2);

		// 1. Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2. Build SessionFactory using configuration
		SessionFactory factory = cfg.buildSessionFactory();

		// 3. Open Session using SessionFactory
		Session session = factory.openSession();

		// 4. Begin Transaction using session
		Transaction txn = session.beginTransaction();

		session.save(c1);
		session.save(c2);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);

		// 5. Commit the Transaction
		txn.commit();

		System.out.println("----->DONE<-----");

    }
}
