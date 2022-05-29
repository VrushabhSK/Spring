package com.xworkz.ormIntegration.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "startups")
public class StartupsEntity {

	private String StartupCity;
	@Id
	private int NoOfUnicorns;
	private String NameOfState;

	public StartupsEntity(String startupCity, int noOfUnicorns, String nameOfState) {
		super();
		StartupCity = startupCity;
		NoOfUnicorns = noOfUnicorns;
		NameOfState = nameOfState;
	}

	public StartupsEntity() {

	}

	public String getStartupCity() {
		return StartupCity;
	}

	public void setStartupCity(String startupCity) {
		StartupCity = startupCity;
	}

	public int getNoOfUnicorns() {
		return NoOfUnicorns;
	}

	public void setNoOfUnicorns(int noOfUnicorns) {
		NoOfUnicorns = noOfUnicorns;
	}

	public String getNameOfState() {
		return NameOfState;
	}

	public void setNameOfState(String nameOfState) {
		NameOfState = nameOfState;
	}

}
