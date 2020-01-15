package client;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext f = new ClassPathXmlApplicationContext("spring.xml");
		Test t = (Test)f.getBean("t");
		Test t1 = (Test)f.getBean("t");
		System.out.println(t==t1);
		t.Hello();
		
		
	}
		
		
		
		
		
		
}
		
		
		
		
		
		
		
		
		
	
