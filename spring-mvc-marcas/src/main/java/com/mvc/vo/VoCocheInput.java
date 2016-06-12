package com.mvc.vo;

public class VoCocheInput {
	
	private String marca;

	
	public VoCocheInput(){
		
	}
	
	
	public VoCocheInput(String marca) {
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
		return "VoCocheInput - \nMarca: " + marca;
	}
	
	
	
	

}
