package com.mvc.dto;

public class CocheInputDto {
	
	private String marca;
	
	
	public CocheInputDto(){
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	

	@Override
	public String toString() {
		return "Marca: " + marca;
	}
	
	
	

}
