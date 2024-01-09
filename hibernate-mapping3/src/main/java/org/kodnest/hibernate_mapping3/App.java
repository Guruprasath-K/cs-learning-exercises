package org.kodnest.hibernate_mapping3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {

		Technology t1 = new Technology();
		Technology t2 = new Technology();
		Technology t3 = new Technology();
		Technology t4 = new Technology();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();

		List<Technology> techList1 = new ArrayList<Technology>();
		techList1.add(t1);
		techList1.add(t3);
		techList1.add(t4);

		List<Technology> techList2 = new ArrayList<Technology>();
		techList2.add(t2);
		techList2.add(t3);

		List<Technology> techList3 = new ArrayList<Technology>();
		techList3.add(t1);
		techList3.add(t2);
		techList3.add(t3);

		List<Technology> techList4 = new ArrayList<Technology>();
		techList4.add(t3);
		techList4.add(t4);

		List<Technology> techList5 = new ArrayList<Technology>();
		techList5.add(t1);
		techList5.add(t2);
		techList5.add(t3);
		techList5.add(t4);

		// ===============================================================

		List<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(e1);
		empList1.add(e3);
		empList1.add(e5);

		List<Employee> empList2 = new ArrayList<Employee>();
		empList2.add(e2);
		empList2.add(e3);
		empList2.add(e5);

		List<Employee> empList3 = new ArrayList<Employee>();
		empList3.add(e1);
		empList3.add(e2);
		empList3.add(e3);
		empList3.add(e4);
		empList3.add(e5);

		List<Employee> empList4 = new ArrayList<Employee>();
		empList4.add(e1);
		empList4.add(e4);
		empList4.add(e5);

		// =============================================================

		t1.setTechId(111);
		t1.setTechName("Java");
		t1.setEmployee(empList1);

		t2.setTechId(222);
		t2.setTechName("Python");
		t2.setEmployee(empList2);

		t3.setTechId(333);
		t3.setTechName("MySQL");
		t3.setEmployee(empList3);

		t4.setTechId(444);
		t4.setTechName("React");
		t4.setEmployee(empList4);

		e1.setId(01);
		e1.setName("Amit");
		e1.setTeam('C');
		e1.setTechnology(techList1);

		e2.setId(02);
		e2.setName("Ankit");
		e2.setTeam('B');
		e2.setTechnology(techList2);

		e3.setId(03);
		e3.setName("Aakash");
		e3.setTeam('A');
		e3.setTechnology(techList3);

		e4.setId(04);
		e4.setName("Ankur");
		e4.setTeam('C');
		e4.setTechnology(techList4);

		e5.setId(05);
		e5.setName("Anjali");
		e5.setTeam('A');
		e5.setTechnology(techList5);

		// 1. Configure the hibernate.cfg.xml file
		Configuration conf = new Configuration();
		conf.configure();

		// 2. Build SessionFactory using Configuration
		SessionFactory factory = conf.buildSessionFactory();

		// 3. Open session using SessionFactory
		Session session = factory.openSession();

		// 4. Begin Transaction using session
		Transaction txn = session.beginTransaction();

		// session.save();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);

		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);

		// 5. Commit the Transaction
		txn.commit();

		System.out.println("----->DONE<-----");

	}
}
