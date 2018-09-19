package com.sony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sony.entity.Student;
import com.sony.service.AddService;

@Controller
public class HomeController 
{
	@Autowired
	AddService service;
	
	@RequestMapping("home")
	public ModelAndView home() 
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("index");
		mv.addObject("student",new Student());
		System.out.println("In home page.................................");
		return mv;
	}

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i, @RequestParam("num2")int j) 
	{
		ModelAndView mv=new ModelAndView();
		
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
		int k=service.add(i,j);
		
		mv.addObject("output", k);
		mv.setViewName("result");
		
		System.out.println(k);
		return mv;

	}

}
