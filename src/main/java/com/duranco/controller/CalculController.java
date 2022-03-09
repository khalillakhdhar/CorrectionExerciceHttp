package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.duranco.model.Calcule;

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
	@PostMapping("div")
	public String diviseur(@RequestParam int a,int b)
	{
		Calcule c=new Calcule(a, b);
		
		return " le PGCD de "+a+" et "+b+" est: "+c.pgcd();
	}
	@GetMapping("facto")
	public String factoriel(@RequestParam int a)
	{
		Calcule c=new Calcule();
		c.setA(a);
		return "la factoriel de "+a +" est: "+c.factoriel();
	
	}
	@PostMapping("general")
	public String allinone(@RequestParam int a,int b)
	{
		Calcule c=new Calcule(a, b);
		return c.toString();
		
	}
	
	
}
