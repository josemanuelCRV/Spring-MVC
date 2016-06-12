package com.mvc.vo;

public class VoCocheOutput {

	private String marca;
	private String modelo;

	public VoCocheOutput() {

	}

	public VoCocheOutput(String marca, String modelo) {
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
		return "VoCocheOutput  \nmarca: " + marca + "\nModelo: " + modelo;
	}

	
	
	
	
	

}
