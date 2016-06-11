package com.mvc.dto;

public class UserInputDto {
	
 	    private String name;
	    private String country;
	    private String city;
	    private String departament;
	    


public UserInputDto() {
	
}



public UserInputDto(String name, String country, String city, String departament) {
	super();
	this.name = name;
	this.country = country;
	this.city = city;
	this.departament = departament;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getCountry() {
		
	return country;
}



public void setCountry(String country) {
	
	this.country = country;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getDepartament() {
	return departament;
}



public void setDepartament(String departament) {
	this.departament = departament;
}



@Override
public String toString() {
	return "UserInputDto [name=" + name + ", country=" + country + ", city=" + city + ", departament=" + departament
			+ "]";
}






}