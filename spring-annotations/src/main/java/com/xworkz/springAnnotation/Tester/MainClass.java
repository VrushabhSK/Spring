package com.xworkz.springAnnotation.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.xworkz.springAnnotation.Bean.FactoryBean;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringAnnotation-config.xml");	
		
		FactoryBean factoryBean = context.getBean(FactoryBean.class);
	     factoryBean.createPaper();
	
		
	}

}
