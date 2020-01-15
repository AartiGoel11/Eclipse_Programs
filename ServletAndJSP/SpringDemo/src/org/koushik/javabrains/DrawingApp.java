package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		//	BeanFactory factory= new  ClassPathXmlApplicationContext("spring.xml");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle= (Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
