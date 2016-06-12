package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.dto.CocheInputDto;
import com.mvc.dto.CocheOutputDto;
import com.mvc.services.CocheInputServices;

@Controller
public class indexController {
	
	@Autowired
	CocheInputServices inputServices;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC - Buscador de Marcas");
		return "index";

	}
	
	
	 @RequestMapping(value = "CarForm", method = RequestMethod.POST)
	    public @ResponseBody CocheOutputDto CarForm(CocheInputDto cocheInDTO) {
	        System.out.println(cocheInDTO.toString());
	               
	        CocheOutputDto carOutputDto = inputServices.getCarListByMarca(cocheInDTO);
	         
	        return carOutputDto;
	    }
	
	
	
	

}
