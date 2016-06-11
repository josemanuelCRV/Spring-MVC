package com.mvc.repository;

import org.springframework.stereotype.Repository;

import com.mvc.dto.UserInputDto;
import com.mvc.vo.VoUserInput;
import com.mvc.vo.VoUserOutput;




@Repository
public class UserInputsRepository {

	// cargar el V.O. de salida
	// mismo objeto de entrada pero de salida distintos valores

	
	
	// desde servicio pasa a repositorio y me devuelve
	
	// paso lo que llega del frontal
	// con el VO llamaríamos al servcio o BBDD o algo de salida
	
	// Salida1 en caso de ser Francia
	public VoUserOutput CargarVO1(VoUserInput userInput) {

		VoUserOutput output = new VoUserOutput();
		
		output.setCp(28023);
		output.setEmail("francia@j.es");
		
		
		return output;

	}
	
	
	
	
	
	// Salida2 en caso de ser Otros
	public VoUserOutput CargarVO2(VoUserInput userInput) {

		VoUserOutput output = new VoUserOutput();
		
		output.setCp(22227);
		output.setEmail("otro@m.com");
		
		
		return output;
	}

}
