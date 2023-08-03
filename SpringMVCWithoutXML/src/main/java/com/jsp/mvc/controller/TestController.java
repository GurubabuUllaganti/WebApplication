package com.jsp.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.mvc.dao.UserinfromationDaoInf;
import com.jsp.mvc.model.Userinformation;

@Controller
public class TestController 
{
	@Autowired
	private UserinfromationDaoInf userinformationdao;
	
	@RequestMapping("/wishes")
	//@ResponseBody
	public String hello() 
	{
		return"Login";
	}
	@RequestMapping("/persondetails")
	public String input(@RequestParam String name,String number , 
			String email,String pass,String radio,String options,Model model)
	{
		System.out.println(name);
		System.out.println(number);
		System.out.println(email);
		System.out.println(pass);
		System.out.println(radio);
		System.out.println(options);
		model.addAttribute("pName", name);
		model.addAttribute("pNumber", number);
		model.addAttribute("mail", email);
		model.addAttribute("password", pass);
		model.addAttribute("gRadio", radio);
		model.addAttribute("cOption", options);
		return"ShowDetails";
		
	}
	@RequestMapping("/inObject")
	public String storeTheValueInObject( Userinformation userinformation,Model model) 
	{
		System.out.println("First Name : "+userinformation.getFristName());
		System.out.println("Frist last Name : "+userinformation.getLastName());
		System.out.println("Date Of Birth : "+userinformation.getDateOfBirth());
		System.out.println("Address : "+userinformation.getAddress());
		System.out.println("Email  : "+userinformation.getEmail());
		System.out.println("Mobile Number : "+userinformation.getMobileNum());
		System.out.println("User Name : "+userinformation.getUserName());
		System.out.println("Password : "+userinformation.getPassword());
		
		int result = userinformationdao.registration(userinformation);
		if(result!=0)
		{
			model.addAttribute("msg", "Data Inserted");
			return"Details";
		}
		else
		{
			model.addAttribute("msg", "No data Found");
			return"Details";
		}
	}
	@RequestMapping("/select")
	public String retrieved(Userinformation userinformation,Model model) 
	{
		Userinformation login = userinformationdao.login(userinformation);
		if(login!=null)
		{
			model.addAttribute("mssg", "Login Sucessfully");
			//System.out.println("Login Successfull");
			return"Login";
		}
		else
		{
			model.addAttribute("mssg", "No data Found");
			//System.out.println("No Data Found..");
			return"Login";
		}
	}
	@RequestMapping("/update")
	public String update(Userinformation userinformation,Model model) 
	{
		int password = userinformationdao.updatePassword(userinformation);
		if(password!=0)
			{
				System.out.println("Password Updated...");
				model.addAttribute("msg", "Password Updated...");
				return "UpdatePassword";
			}
			else
			{
				System.out.println("No Data Found...");
				model.addAttribute("msg", "No Data Found...");
				return "UpdatePassword";
			}
	}
	
}

