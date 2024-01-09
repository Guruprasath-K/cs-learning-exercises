package org.kodnest.spring03;

import org.kodnest.bean.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Employee e1 = (Employee) context.getBean("emp1");
		System.out.println(e1);
    }
}
