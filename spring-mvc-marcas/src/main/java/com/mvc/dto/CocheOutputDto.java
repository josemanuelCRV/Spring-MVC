package com.mvc.dto;

public class CocheOutputDto {
	
	private String marca;
	private String modelo;
	
	
	
	public CocheOutputDto(){
		
	}



	public CocheOutputDto(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
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



	@Override
	public String toString() {
		return "CocheOutputDto [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
	
	
	

}
