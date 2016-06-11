package com.mvc.vo;

public class VoUserOutput {

	
	//Salen hacia  UserOutputDto
	
	private String email;
	private int cp;
	
	
	
	public VoUserOutput(){
		
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}



	@Override
	public String toString() {
		return "VoUserOutput [email=" + email + ", cp=" + cp + "]";
	}
	
	
	
	
	
	
	
	
	
}
