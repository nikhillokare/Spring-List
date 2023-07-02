package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("singer.xml");
		Singer s = (Singer)a.getBean("sing");
		s.display();

	}

}
