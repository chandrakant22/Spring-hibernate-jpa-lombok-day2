package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmplyeeRepo;

@Controller
public class HomeController {
	
	@Autowired
	EmplyeeRepo db;
	
	@RequestMapping("/")
	String myfun(Model m)
	{
		Employee e=new Employee();
		m.addAttribute("emp", e);
		return "reg";
	}
	
	@RequestMapping("/register")
	@ResponseBody
	String myfun1(@ModelAttribute("emp") Employee e)
	{
	   System.out.println(e.toString());
	   db.save(e);
		return "Data Inserted";
	}
}
