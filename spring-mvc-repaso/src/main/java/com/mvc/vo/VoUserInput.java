package com.mvc.vo;


// LLega desde la entrada y en el servicio 
// se mapea a VO



public class VoUserInput {

	// Vienen desde UserInputDto
	
	
	private String name;
	private String country;
	private String city;
	private String departament;
	private String direccion;
	private String edad;
	
	
	public VoUserInput(){
		
		
		
	}
	
	public VoUserInput(String name, String country, String city, String departament, String direccion, String edad) {
		super();
		this.name = name;
		this.country = country;
		this.city = city;
		this.departament = departament;
		this.direccion = direccion;
		this.edad = edad;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	
	@Override
	public String toString() {
		return "VoUserInput [name=" + name + ", country=" + country + ", city=" + city + ", departament=" + departament
				+ ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	
	
	

}
