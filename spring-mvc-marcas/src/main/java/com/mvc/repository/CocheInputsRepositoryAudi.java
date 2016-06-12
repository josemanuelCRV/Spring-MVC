package com.mvc.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mvc.vo.VoCocheInput;
import com.mvc.vo.VoCocheOutput;

@Repository
public class CocheInputsRepositoryAudi {

	public ArrayList<VoCocheOutput> CargarVoAudi(VoCocheInput cocheInput) {

		ArrayList<VoCocheOutput> arrayCoches = new ArrayList<VoCocheOutput>();

		arrayCoches.add(new VoCocheOutput("Audi", "A3"));
		arrayCoches.add(new VoCocheOutput("Audi", "Q7"));
		arrayCoches.add(new VoCocheOutput("Audi", "R8"));

		return arrayCoches;

	}

}
