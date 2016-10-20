package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.HelloModel;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloworld()
	{
		return new ModelAndView("hello");
	}
	
	@RequestMapping("/sendMessage")
	public ModelAndView msgsender(ModelMap m,@ModelAttribute HelloModel hm)
	{
		m.addAttribute("msg", hm.getMsg());
		
		if(hm.getMsg().equals("Twitter"))
		{
			return new ModelAndView("sendMessage");
		}
		else if(hm.getMsg().equals("Facebook"))
		{
			return new ModelAndView("sendMessage");
		}
		else if(hm.getMsg().equals("Email"))
		{
			return new ModelAndView("sendMessage");
		}
		else
		{
			return new ModelAndView("error");
		}
	}
}
