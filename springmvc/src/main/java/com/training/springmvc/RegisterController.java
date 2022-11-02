package com.training.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping("/")
	public ModelAndView showRegister()
	{
	return new ModelAndView("register");
		
	}
	@RequestMapping("/reg")
	public ModelAndView showWelcome(HttpServletRequest req)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		String name=req.getParameter("name");
		mv.addObject(name, name);
		return mv;
	}

}
