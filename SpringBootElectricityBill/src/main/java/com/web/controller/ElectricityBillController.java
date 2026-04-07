package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ElectricityBillController {
	@RequestMapping("/")
	public String Billform()
	{
		return "Bill";
	}
	@RequestMapping("/req1")
	public String ElectricityBill(@RequestParam String cId,
			@RequestParam String cN,
			@RequestParam int cR,
			@RequestParam int pR,
			ModelMap model) 
	{
		model.put("ConsummerId", cId);
		model.put("ConsummerName",cN);
		model.put("ConsummerReading", cR);
		model.put("previousReading", pR);
		 
		int units = cR-pR;
		model.put("units", units);
		double TotalBill=0.0;
		if(units<300) 
		{
			TotalBill = units*1.75;
		}
		else if (units>=300 && units<500)
		{
			TotalBill = units*3.25;
		}
		else
		{
			TotalBill = units*7.25;
		}
		model.put("TotalBill", TotalBill);
		return "result";
	}
}
