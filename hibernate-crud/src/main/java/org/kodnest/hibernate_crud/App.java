package org.kodnest.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
		// create();
		// read();
		// update();
		delete();
    }

	private static void delete() {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		// To read data from Database
		Laptop laptop = session.get(Laptop.class, 111);
		session.delete(laptop);
		txn.commit();
		System.out.println("Laptop has been deleted " + laptop);
	}

	private static void update() {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		// To read data from Database
		Laptop laptop = session.get(Laptop.class, 111);
		laptop.setLaptopBrand("Asus");
		laptop.setCost(85000.00);
		session.save(laptop);
		txn.commit();
		System.out.println("Laptop has been updated " + laptop);

	}

	private static void read() {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		// To read data from Database
		Laptop laptop = session.get(Laptop.class, 111);
		txn.commit();
		System.out.println("Laptop has been fetched " + laptop);

	}

	private static void create() {
		Laptop laptop = new Laptop(111, "Dell", 58000.00);
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(laptop);
		txn.commit();
		System.out.println("Laptop has been created " + laptop);
	}
}
