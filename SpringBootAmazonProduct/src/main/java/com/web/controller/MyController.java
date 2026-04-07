package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
		@RequestMapping("/")
		public String InvoiceForm()
		{
			return "numbers";
		}
		@RequestMapping("/req")
		public String productInvoice(@RequestParam String cId,
				@RequestParam String cN,
				@RequestParam long mbN,
				@RequestParam String pN,
				@RequestParam double price,
				@RequestParam int Quantity,
				ModelMap model)
		{
			model.put("customerId", cId);
			model.put("customerName", cN);
			model.put("mobileNumber", mbN);
			model.put("productName", pN);
			model.put("price", price);
			model.put("Quantity", Quantity);
			double totalammount = price * Quantity;
			double discountammount =0.0;
			if(totalammount<2500)
			{
				discountammount = totalammount*0.10;
			}
			else if (totalammount>=2500 && totalammount<5000)
			{
				discountammount = totalammount*0.15;
			}
			else
			{
				discountammount = totalammount*0.30;
			}
			double gst = totalammount*0.10;
			double invoicebill = 0.0;
			invoicebill = totalammount-discountammount+gst;
			
			model.put("TotalAmt" , totalammount);
			model.put("Discount" , discountammount);
			model.put("Invoicebill" , invoicebill);
			return "result";
		}
}

		