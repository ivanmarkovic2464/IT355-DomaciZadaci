/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic;

import com.it355.ivanmarkovic.dao.KategorijaDao;
import com.it355.ivanmarkovic.dao.KorisnikDao;
import com.it355.ivanmarkovic.model.Soba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.it355.ivanmarkovic.dao.SobaDao;
import com.it355.ivanmarkovic.model.Kategorija;
import com.it355.ivanmarkovic.model.Korisnik;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author Ivke
 */
@Controller
public class SobaController {
    
    @Autowired
    private MessageSource messageSource;
        
    @Autowired
    private SobaDao sobaDao;
    
    @Autowired
    private KorisnikDao korisnikDao;
    
    @Autowired
    private KategorijaDao kategorijaDao;
    
    @RequestMapping(value= "/", method = RequestMethod.GET)
    public String pocetna(ModelMap model){
        model.addAttribute("poruka","Moje ime je Ivan Marković!");
        return "pocetna";
    }
    
    @RequestMapping(value = {"/korisnik"}, method = RequestMethod.GET)
    public ModelAndView defaultPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je strana kojoj svi mogu da pristupe!");
        model.setViewName("korisnik");
        return model;
    }
    
    @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je strana za admine!");
        model.setViewName("admin");
        return model;
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
    @RequestParam(value = "logout", required = false) String logout) {
 
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Losi login podaci!");
        }
 
        if (logout != null) {
            model.addObject("msg", "Izlogovani ste.");
        }
        model.setViewName("login");
 
        return model;
    }
    
    @RequestMapping(value = "/dodavanjeKategorije", method = RequestMethod.GET)
    public String addCategory(Model model) {
        model.addAttribute("kategorija", new Kategorija());
        return "dodavanjeKategorije";
    }

    @RequestMapping(value = "/dodavanjeKategorije", method = RequestMethod.POST)
    public ModelAndView addCategory(@ModelAttribute("kategorija") Kategorija k, ModelAndView model) {
        kategorijaDao.addKategoriju(k);
        model.addObject("successMsg", "Category successfully added");
        return model;
    }
    
    
    @RequestMapping(value = "/editSobu/{id}", method = RequestMethod.GET)
    public String dodavanjeSobe(@PathVariable("id") int id, Model model) {
         Soba soba = sobaDao.getSobaById(id);
        model.addAttribute("soba",soba);
        model.addAttribute("kategorije", kategorijaDao.getAllKategorije());
        return "dodavanjeSobe";
    }
    
    @RequestMapping(value="/dodavanjeSobe", method = RequestMethod.GET)
    public String dodavanjeSobe(Model model){
        model.addAttribute("soba", new Soba());
        model.addAttribute("kategorije", kategorijaDao.getAllKategorije());
        return "dodavanjeSobe";
    }

    @RequestMapping(value="/dodavanjeSobe", method = RequestMethod.POST)
    public ModelAndView dodavanjeSobe(@ModelAttribute("soba") Soba soba, ModelAndView model){
        //soba.setId(sobaDao.getCountSobe()+1);
        soba = sobaDao.addSoba(soba);
        model.addObject("kategorije", kategorijaDao.getAllKategorije());
        model.addObject("successMsg", "Room successfully added");
        model.addObject("soba",soba);
              
        return model;
    }
    
    @RequestMapping(value="/sobe", method=RequestMethod.GET)
    public ModelAndView sobe(ModelAndView modelAndView) {
        modelAndView.addObject("sob", sobaDao.getAllRooms());
        modelAndView.addObject("soba", new Soba());
        return modelAndView;
    }
    
    @RequestMapping(value="/korisnici", method=RequestMethod.GET)
        public ModelAndView korisnici(ModelAndView modelAndView) {
        modelAndView.addObject("koris", korisnikDao.getAllKorisnici());
        modelAndView.addObject("korisnik", new Korisnik());
        return modelAndView;
    }
    
    @RequestMapping(value = "/deleteSobu/{id}", method = RequestMethod.GET)
    public String deleteSobu(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting room with id " + id);
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            System.out.println("Unable to delete. Room with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        sobaDao.deleteSobu(soba);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/deleteKorisnika/{username}", method = RequestMethod.GET)
    public String deleteKorisnika(@PathVariable("username") String username, HttpServletRequest request) {
        System.out.println("Fetching & Deleting user with username " + username);
        Korisnik korisnik = korisnikDao.getKorisnikByName(username);
        /*if (korisnik == null) {
            System.out.println("Unable to delete. Product with username " + username + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }*/

        korisnikDao.deleteKorisnika(korisnik);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {
 
        ModelAndView model = new ModelAndView();
 
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            System.out.println(userDetail);
            model.addObject("username", userDetail.getUsername());
        }
        model.setViewName("403");
        return model;
    }
}
