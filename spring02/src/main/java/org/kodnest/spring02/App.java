package org.kodnest.spring02;

import org.kodnest.bean.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Laptop s1 = (Laptop) context.getBean("s1");
		Laptop s2 = (Laptop) context.getBean("s2");
		System.out.println("----> Object created by Spring = " + s1);
		System.out.println("----> Object created by Spring = " + s2);
    }
}
