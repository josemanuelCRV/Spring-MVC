package com.mvc.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mvc.vo.VoCocheInput;
import com.mvc.vo.VoCocheOutput;

@Repository
public class CocheInputsRepositoryFord {
	
	
	public ArrayList<VoCocheOutput> CargarVoFord(VoCocheInput cocheInput) {

		ArrayList<VoCocheOutput> arrayCoches = new ArrayList<VoCocheOutput>();

		arrayCoches.add(new VoCocheOutput("Ford", "Focus"));
		arrayCoches.add(new VoCocheOutput("Ford", "C-Max"));
		arrayCoches.add(new VoCocheOutput("Ford", "Megane"));

		return arrayCoches;

	}
	

}
