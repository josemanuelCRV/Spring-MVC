package com.mvc.repository;


import org.springframework.stereotype.Repository;

import com.mvc.vo.VoUserInput;
import com.mvc.vo.VoUserOutputAudi;
import com.mvc.vo.VoUserOutputFord;

@Repository
public class UserInputsRepositoryFord {

	public VoUserOutputFord CargaVOoutpuFord(VoUserInput userInput) {

		VoUserOutputFord outputFord = new VoUserOutputFord();

		outputFord.setModelo("FORD Focus");
		outputFord.setMatricula("88888ZZZ");

		return outputFord;
	}

}

/**
 * 
 * private void marcas() {
 * 
 * // TODO Auto-generated method stub
 * 
 * // Declaracion ArrayList<String> marcas;
 * 
 * // Crear instancia marcas = new ArrayList<String>();
 * 
 * // Agregar elementos marcas.add("Audi A3"); marcas.add("Audi Q7");
 * marcas.add("Audi R8");
 * 
 * // Recorrer arraylist con for
 * 
 * for (int i = 0; i < marcas.size(); i++) { System.out.println("--->" +
 * marcas.get(i)); }
 * 
 * }
 */