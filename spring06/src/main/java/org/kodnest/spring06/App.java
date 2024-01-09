package org.kodnest.spring06;

import org.kodnest.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Person person1 = (Person) context.getBean("person");
		System.out.println(person1);
    }
}
