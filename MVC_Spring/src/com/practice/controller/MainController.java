package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.entity.Personhv;

@Controller
public class MainController {

	@Autowired
	Personhv person;
	
	@Autowired
	ModelAndView mV;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView indexPage() {
		mV.addObject("title","MVC Spring");
		mV.setViewName("index");
		return mV;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView form() {
		mV.addObject("command", person);
		mV.setViewName("addPerson");
		return mV;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String onSubmit(Model model,@ModelAttribute("command")Personhv p, BindingResult res) {
		System.out.println(p);
		String view="/";
		if(res.hasErrors()) {
			view="addPerson";
		}
		else {
			model.addAttribute("person", p);
			view="success";
		}
		return view;
	}
}
