/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic;

import com.it355.dao.SobaService;
import com.it355.model.Soba;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author Ivke
 */
@Controller
public class SobaController {
    
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private SobaService sobaService;
    
    @RequestMapping(value= "/", method = RequestMethod.GET)
    public String printStudent(ModelMap model){
        model.addAttribute("poruka","Moje ime je Ivan Marković!");
        return "pocetna";
    }
    
    @RequestMapping(value="/dodavanjeSobe", method = RequestMethod.GET)
    public ModelAndView soba(){
        sobaService.addSoba();
        try {
            sobaService.addSobaSaIzuzetkom();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(messageSource.getMessage("bathroom", null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("tv", null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("airCondition", null, Locale.ENGLISH));
        
        return new ModelAndView("dodavanjeSobe","command",new Soba());
    }
    
    @RequestMapping(value="/dodajSobu", method = RequestMethod.POST)
    public String dodajSobu(@ModelAttribute Soba soba, ModelMap model){
        model.addAttribute("brojKreveta", soba.getBrojKreveta());
        model.addAttribute("velicinaSobe", soba.getVelicinaUMetrimaKvadratnim());
        model.addAttribute("kupatilo", soba.getKupatilo());
        model.addAttribute("tv", soba.getTv());
        model.addAttribute("klima", soba.getKlima());
        model.addAttribute("cena", soba.getCenaPoDanu());
        
        sobaService.addSobaAround(soba.getBrojKreveta());
        
        return "soba";
    }
}
