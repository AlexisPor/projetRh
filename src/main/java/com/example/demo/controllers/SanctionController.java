package com.example.demo.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.persistance.entities.AfpaSanction;
import com.example.demo.services.SanctionService;

@Controller
public class SanctionController {

	@Autowired
	SanctionService sanctionService;
	
	@RequestMapping("/addSanc")
	public ModelAndView ajouterSanc() {
		AfpaSanction sanction = new AfpaSanction();
		ModelAndView model = new ModelAndView("newSanc","sanction",sanction);
		
		return model;
	}
	
	@RequestMapping("/saveSanc")
	public ModelAndView saveSanc(@ModelAttribute AfpaSanction sanction) {
		System.out.println("sanction="+sanction);
		
		sanctionService.add(sanction);
		
		ModelAndView model = new ModelAndView("redirect:/listSanc");
		
		
		return model;
	}
	
	@RequestMapping("/listSanc")
	public ModelAndView listSanc() {
		
		ModelAndView model = new ModelAndView("listSanc");
		List<AfpaSanction> listSanc = new ArrayList<AfpaSanction>();
		
		listSanc=sanctionService.findAll();
		model.addObject("listsanc", listSanc);
		
		return model;
	}
	
	@RequestMapping("deleteSanc")
    public ModelAndView deleteSanc(BigDecimal id) {
        AfpaSanction sanc = sanctionService.findByRefSanction(id);
        sanctionService.delete(sanc);
        ModelAndView model = new ModelAndView("redirect:/listSanc");
        return model;
    }
	
	@RequestMapping("editSanc")
    public ModelAndView editSanc(BigDecimal id) {
        AfpaSanction sanction = sanctionService.findByRefSanction(id);
       
        ModelAndView model = new ModelAndView("updateSanc", "sanction",sanction);
        return model;
    }
	
	@RequestMapping("updateSanc")
    public ModelAndView updateSanc(@ModelAttribute AfpaSanction sanc) {
        sanctionService.update(sanc);
        ModelAndView model = new ModelAndView("redirect:/listSanc");
        return model;
    }
}
