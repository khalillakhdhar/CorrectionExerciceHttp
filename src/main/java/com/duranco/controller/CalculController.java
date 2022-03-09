package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CalculController {

	@GetMapping("")
	public ModelAndView accueil()
	{
		ModelAndView mv=new ModelAndView("accueil.html");
		return mv;
		
	}
	@GetMapping("solution")
	public ModelAndView solutions()
	{
		ModelAndView model=new ModelAndView("solution.html");
		return model;
	}
	@GetMapping("fact")
	public ModelAndView calculfacto()
	{
		ModelAndView model=new ModelAndView("factoriel.html");
		return model;
	}
	@GetMapping("pgcd")
	public ModelAndView div()
	{
		ModelAndView model=new ModelAndView("diviseur.html");
		return model;
	}
	
	
	
}
