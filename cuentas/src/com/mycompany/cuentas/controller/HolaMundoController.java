package com.mycompany.cuentas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class HolaMundoController {

	@RequestMapping
	public String metodo(ModelMap model){
		System.out.println("YA CHAVO!");
		model.addAttribute("hola", "Hola Mundo Spring MVC!");
		
		return "hola-springmvc";  
	}
}
