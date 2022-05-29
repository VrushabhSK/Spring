package com.xworkz.ormIntegration.DAO;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.xworkz.ormIntegration.Entity.StartupsEntity;

public class StartupsDAO {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// save Startup
	@Transactional
	public void insert(StartupsEntity startupsEntity) {
		Integer integer = (Integer) this.hibernateTemplate.save(startupsEntity);

		System.out.println("calling th save ()");
	}
}
