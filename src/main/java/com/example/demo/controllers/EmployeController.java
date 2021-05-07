package com.example.demo.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.persistance.entities.AfpaEmployeweb;
import com.example.demo.services.EmployeService;

@Controller
public class EmployeController {
	
	@Autowired
	EmployeService employeService;

	@RequestMapping("/")
	//@ResponseBody
	public String home() {
		return"home";
	}
	
	@RequestMapping("/addEmp")
	public ModelAndView ajouterEmp() {
		AfpaEmployeweb emp = new AfpaEmployeweb();
		ModelAndView model = new ModelAndView("newEmp","employe",emp);
		
		return model;
	}
	
	@RequestMapping("/saveEmp")
	public ModelAndView saveEmp(@ModelAttribute AfpaEmployeweb employe) {
		System.out.println("employe="+employe);
		
		employeService.add(employe);
		
		ModelAndView model = new ModelAndView("redirect:/listEmp");
		
		
		return model;
	}
	
	@RequestMapping("/listEmp")
	public ModelAndView listEmp() {
		
		ModelAndView model = new ModelAndView("listEmp");
		List<AfpaEmployeweb> listEmp = new ArrayList<AfpaEmployeweb>();
		
		listEmp=employeService.findAll();
		model.addObject("listemp", listEmp);
		
		return model;
	}
	
	@RequestMapping("deleteEmp")
    public ModelAndView delete(BigDecimal id) {
        AfpaEmployeweb emp = employeService.findByCode(id);
        employeService.delete(emp);
        ModelAndView model = new ModelAndView("redirect:/listEmp");
        return model;
    }
	
	@RequestMapping("editEmp")
    public ModelAndView edit(BigDecimal id) {
        AfpaEmployeweb employe = employeService.findByCode(id);
       
        ModelAndView model = new ModelAndView("updateEmp", "employe",employe);
        return model;
    }
	
	@RequestMapping("updateEmp")
    public ModelAndView update(@ModelAttribute AfpaEmployeweb emp) {
        employeService.update(emp);
        ModelAndView model = new ModelAndView("redirect:/listEmp");
        return model;
    }
}
