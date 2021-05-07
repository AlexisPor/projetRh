package com.example.demo.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.persistance.entities.AfpaAbsence;
import com.example.demo.services.AbsenceService;

@Controller
public class AbsenceController {

	@Autowired
	AbsenceService absenceService;
	
	@RequestMapping("/addAbs")
	public ModelAndView ajouterAbs() {		
		AfpaAbsence afpaAbsence = new AfpaAbsence();
		ModelAndView model = new ModelAndView("newAbs","absence",afpaAbsence);
		
		return model;
	}
	
	@RequestMapping("/saveAbs")
	public ModelAndView saveAbs(@ModelAttribute AfpaAbsence absence) {
		System.out.println("absence="+absence);
		
		absenceService.add(absence);
		
		ModelAndView model = new ModelAndView("redirect:/listAbs");
		
		
		return model;
	}
	
	@RequestMapping("/listAbs")
	public ModelAndView listAbs() {
		
		ModelAndView model = new ModelAndView("listAbs");
		List<AfpaAbsence> listAbs = new ArrayList<AfpaAbsence>();
		
		listAbs=absenceService.findAll();
		model.addObject("listabs", listAbs);
		
		return model;
	}
	
	@RequestMapping("deleteAbs")
    public ModelAndView delete(BigDecimal id) {
        AfpaAbsence abs = absenceService.findByIdabsence(id);
        absenceService.delete(abs);
        ModelAndView model = new ModelAndView("redirect:/listAbs");
        return model;
    }
	
	@RequestMapping("editAbs")
    public ModelAndView edit(BigDecimal id) {
        AfpaAbsence abs = absenceService.findByIdabsence(id);
       
        ModelAndView model = new ModelAndView("updateAbs", "absence",abs);
        return model;
    }
	
	@RequestMapping("updateAbs")
    public ModelAndView update(@ModelAttribute AfpaAbsence abs) {
        absenceService.update(abs);
        ModelAndView model = new ModelAndView("redirect:/listAbs");
        return model;
    }
}
