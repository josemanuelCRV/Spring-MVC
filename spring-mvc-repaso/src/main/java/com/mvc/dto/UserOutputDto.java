package com.mvc.dto;


// esta clase es de salida.. Se realiza en Servicio y prepara un DTO para VO

public class UserOutputDto {
	
  
    private String email;
    private int cp;


public UserOutputDto() {

}


public UserOutputDto(String email, int cp) {
	super();
	this.email = email;
	this.cp = cp;
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
	return "UserOutputDto [email=" + email + ", cp=" + cp + "]";
}



	
	

}
