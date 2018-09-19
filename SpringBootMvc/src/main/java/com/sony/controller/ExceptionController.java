package com.sony.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value=ArithmeticException.class)
	public ModelAndView exceptionHandler(Exception e)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", e.getMessage());
		mv.setViewName("exception");
		System.out.println(e);
		
		return mv;
				
	}

}
