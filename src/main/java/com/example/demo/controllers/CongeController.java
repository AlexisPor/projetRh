package com.example.demo.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.persistance.entities.AfpaConge;
import com.example.demo.services.CongeService;

@Controller
public class CongeController {

	@Autowired
	CongeService congeService;
	
	@RequestMapping("/addCon")
	public ModelAndView ajouterCon() {
		AfpaConge conge = new AfpaConge();
		ModelAndView model = new ModelAndView("newCon","conge",conge);
		
		return model;
	}
	
	@RequestMapping("/saveCon")
	public ModelAndView saveCon(@ModelAttribute AfpaConge conge) {
		System.out.println("conge="+conge);
		
		congeService.add(conge);
		
		ModelAndView model = new ModelAndView("redirect:/listCon");
		
		
		return model;
	}
	
	@RequestMapping("/listCon")
	public ModelAndView listCon() {
		
		ModelAndView model = new ModelAndView("listCon");
		List<AfpaConge> listCon = new ArrayList<AfpaConge>();
		
		listCon=congeService.findAll();
		model.addObject("listcon", listCon);
		
		return model;
	}
	
	@RequestMapping("deleteCon")
    public ModelAndView deleteCon(BigDecimal id) {
        AfpaConge con = congeService.findByRefConge(id);
        congeService.delete(con);
        ModelAndView model = new ModelAndView("redirect:/listCon");
        return model;
    }
	
	@RequestMapping("editCon")
    public ModelAndView editCon(BigDecimal id) {
        AfpaConge con = congeService.findByRefConge(id);
       
        ModelAndView model = new ModelAndView("updateCon", "conge",con);
        return model;
    }
	
	@RequestMapping("updateCon")
    public ModelAndView updateCon(@ModelAttribute AfpaConge con) {
        congeService.update(con);
        ModelAndView model = new ModelAndView("redirect:/listCon");
        return model;
    }
}
