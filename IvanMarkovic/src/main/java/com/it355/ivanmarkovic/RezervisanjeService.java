/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic;

import com.it355.model.Rezervacija;
import java.io.Serializable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ivan
 */
@Service
public class RezervisanjeService implements Serializable{
  
    public String rezervisanje(Rezervacija rezervacija)
    {
        String imeiPrezime = rezervacija.getImeIPrezime();
        String brojOsoba = rezervacija.getBrojOsoba();
        String brojDanaOdsedanja = rezervacija.getBrojDanaOdsedanja();
        if(( (!(imeiPrezime.equals(""))) && (!(brojDanaOdsedanja.equals(""))) ) 
                && (!(brojOsoba.equals(""))))
        {
            return "true";
        }else{
            return "false";
        }
    }
}
