package com.mvc.dto;

public class UserOutputDto {
	
	
	private String marca;
	private String modelo;
	private String matricula;
	
	public UserOutputDto() {

	}
	
	public UserOutputDto( String marca, String modelo, String matricula) {
		super();
		this.marca= marca;
		this.modelo = modelo;
		this.matricula = matricula;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	@Override
	public String toString() {
		return "UserOutputDto [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}
	
	
	
	

}
