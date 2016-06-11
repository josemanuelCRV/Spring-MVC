package com.mvc.dto;

public class UserInputDto {

	private String marca;
	
	UserInputDto(){
		
	}

	public UserInputDto(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "UserInputDto [marca=" + marca + "]";
	}

	
	
}
