package com.mvc.dto;

public class UserOutputDto {
	
	
	
	private String modelo;
	private String matricula;
	
	public UserOutputDto() {

	}
	
	public UserOutputDto(String modelo, String matricula) {
		super();
		this.modelo = modelo;
		this.matricula = matricula;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
