package com.mvc.vo;

public class VoUserInput {
	
	private String marca;

	
	
	public VoUserInput() {
		 
	}

	public VoUserInput(String marca) {
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
		return "VoUserInput [marca=" + marca + "]";
	}
	
	
	
	

}
