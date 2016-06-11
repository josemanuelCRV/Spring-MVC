package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.dto.UserInputDto;
import com.mvc.dto.UserOutputDto;
import com.mvc.services.UserInputServices;

@Controller
public class IndexController {

	UserInputServices inputServices;
	
	UserOutputDto userOutputDto;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC - Bienvenido");
		return "index";

	}

	/**
	 * En este caso spring identifica los atributos y del formulario y los mapea
	 * a un objeto User
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "carform", method = RequestMethod.POST)
	public @ResponseBody UserOutputDto carform(UserInputDto userInDTO) {
		System.out.println(userInDTO.toString());
	 	UserOutputDto userOutputDto = inputServices.getCarListByMarca(userInDTO);
		return userOutputDto;
	}

}
