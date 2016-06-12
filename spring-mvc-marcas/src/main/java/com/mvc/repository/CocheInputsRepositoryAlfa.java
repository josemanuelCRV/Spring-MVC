package com.mvc.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mvc.vo.VoCocheInput;
import com.mvc.vo.VoCocheOutput;

@Repository
public class CocheInputsRepositoryAlfa {
	
	
	
	public ArrayList<VoCocheOutput> CargarVoAlfa(VoCocheInput cocheInput ){
		
	 
		
		
		ArrayList<VoCocheOutput> arrayCoches = new ArrayList<VoCocheOutput>();
		
		arrayCoches.add(new VoCocheOutput("Alfa", "Julietta"));
		arrayCoches.add(new VoCocheOutput("Alfa", "Spirit"));
		arrayCoches.add(new VoCocheOutput("Alfa", "Sonnar"));
		arrayCoches.add(new VoCocheOutput("Alfa", "Sperantto"));
		
	 
		
		return arrayCoches;
		
		
		
	}
	
	
	
	
	
	
	

}
