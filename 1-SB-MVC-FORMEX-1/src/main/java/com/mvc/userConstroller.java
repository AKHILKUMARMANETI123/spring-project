package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userConstroller {
	@RequestMapping("/")
	public String userpage(ModelMap model)
	{
		User user=new User();
		model.put("user", user);
		return "reg";
		
	}
	@RequestMapping("/register")
	public String register(@ModelAttribute User user,ModelMap model)
	
	{
		model.put("users",user);
		
		return "result";
		
	}

}
