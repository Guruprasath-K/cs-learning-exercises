package org.kodnest.spring01;

import org.kodnest.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Student s1 = (Student) context.getBean("s1");
		System.out.println("---> Object created by Spring = " + s1);
    }
}
