package com.xworkz.ormIntegration.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.ormIntegration.DAO.StartupsDAO;
import com.xworkz.ormIntegration.Entity.StartupsEntity;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StartupsDAO startupsDAO = context.getBean("startupsDAO", StartupsDAO.class);

		StartupsEntity startupsEntity = new StartupsEntity("Bengaluru", 34, "Karnataka");

		startupsDAO.insert(startupsEntity);
		System.out.println("inserted");

	}

}
