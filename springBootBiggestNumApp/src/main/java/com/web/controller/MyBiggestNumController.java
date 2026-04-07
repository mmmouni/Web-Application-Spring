package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyBiggestNumController {
	@RequestMapping("/")
	public String numberForm()
	{
		return "number";
	}
	@RequestMapping("/req1")
	public String MyBiggestNumController(@RequestParam int fnumber,
			@RequestParam int snumber,
			@RequestParam int tnumber,
			ModelMap model)
	{
		model.put("fnumber" , fnumber);
		model.put("snumber" , snumber);
		model.put("tnumber" , tnumber);
		String message = null;
		if(fnumber>snumber && fnumber>tnumber)
		{
			message = "first number is biggest";
		}
		else if (snumber>tnumber && snumber>tnumber) 
		{
			message = "second number is biggest";
		}
		else
		{
			message = "third number is biggest";
		}
		model.put("message", message);
		return "Result";
	}
}


