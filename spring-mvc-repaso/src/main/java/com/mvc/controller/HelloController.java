package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.dto.UserInputDto;
import com.mvc.dto.UserOutputDto;
import com.mvc.services.UserInputServices;

@Controller
public class HelloController {

	@Autowired
	UserInputServices inputServices;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
	}

	
	
	/**
     * En este caso spring identifica los atributos del formulario y los mapea a un objeto User
     * @param user
     * @param model
     * @return
     */	
	@RequestMapping(value = "/PaisForm", method = RequestMethod.POST)
    public @ResponseBody UserOutputDto PaisForm(UserInputDto userInDTO) {
       
        UserOutputDto userOutputDto = inputServices.getUserDataByCountry(userInDTO);
        
        System.out.println(userOutputDto.toString()); 
        
        return userOutputDto;
    }
    
    
    
    
    
    
	
	
	
	
	

}