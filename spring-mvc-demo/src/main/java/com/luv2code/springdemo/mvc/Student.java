package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryoptions;
	private String favoriteLanguage;
	private String[] operationSystems;
	
	
	public String[] getOperationSystems() {
		return operationSystems;
	}

	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryoptions() {
		return countryoptions;
	}

	public void setCountryoptions(LinkedHashMap<String, String> countryoptions) {
		this.countryoptions = countryoptions;
	}

	public Student() {
		countryoptions = new LinkedHashMap<>();
		countryoptions.put("BR", "Brazil");
		countryoptions.put("FR", "France");

		countryoptions.put("DE", "Germany");

		countryoptions.put("IN", "India");
		countryoptions.put("US", "USA");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
