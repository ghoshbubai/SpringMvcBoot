package com.sony.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sony.entity.Student;

@Controller
public class StudentController 
{
	@PostMapping("addStudent")
	public ModelAndView addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("index");
		}
		ModelAndView mv=new ModelAndView();
		System.out.println(student);
		
		mv.addObject("stud",student);
		mv.setViewName("stdDtl");
		
		return mv;
	}
	
}
