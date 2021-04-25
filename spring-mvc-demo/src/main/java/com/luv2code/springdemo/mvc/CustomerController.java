package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
//		this model would have a customer object, its id is customer
	
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult
			) {
		System.out.println("The customer: |" + theCustomer.getFirstName() + " |" + theCustomer.getLastName() +" |");
		System.out.println( "Binding result:" + theBindingResult);
		if(theBindingResult.hasErrors()) {
			return  "customer-form";
		}
		return "customer-confirmation";
	}
}