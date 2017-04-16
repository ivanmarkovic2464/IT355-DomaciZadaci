/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic;

import com.it355.ivanmarkovic.dao.KategorijaDao;
import com.it355.ivanmarkovic.dao.KorisnikDao;
import com.it355.ivanmarkovic.dao.SobaDao;
import com.it355.ivanmarkovic.model.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Ivan
 */
@RestController
public class RESTContrloer {
    
    @Autowired
    private SobaDao sobaDao;
    
    @Autowired
    private KorisnikDao korisnikDao;
    
    @Autowired
    private KategorijaDao kategorijaDao;
    
    //metoda koja prikazuje sve sobe, tipa get, a sobe prikazuje u JSON formatu
    @RequestMapping(value = "/sobe", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Soba>> getAllRooms() {
        System.out.println("Fetching rooms");
        List<Soba> sobe = sobaDao.getAllRooms();
        if (sobe.size() == 0) {
            System.out.println("Rooms list empty");
            return new ResponseEntity<List<Soba>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Soba>>(sobe, HttpStatus.OK);
    }
    
    //metoda koja po id-ju prikazuje jedan produkt. 
    //na adresi http://localhost:8080/IvanMarkovic/sobe/4 pozivamo ovu metodu
    //
    @RequestMapping(value = "/soba/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Soba> getRoom(@PathVariable("id") int id) {
        System.out.println("Fetching room with id " + id);
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            System.out.println("Room with " + id + " not found");
            return new ResponseEntity<Soba>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Soba>(soba, HttpStatus.OK);
    }
    
    
    //metoda koja cuva proizvod u bazu
    @RequestMapping(value = "/soba/", method = RequestMethod.POST)
    public ResponseEntity<Void> addRoom(@RequestBody Soba soba) {
        System.out.println("Adding room " + soba.toString());
        sobaDao.addSoba(soba);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
      
    //metoda koja uzima proizvod iz baze po id-u, menja ga i cuva ga u bazi
    @RequestMapping(value = "/soba/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Soba> updateRoom(@PathVariable("id") int id, @RequestBody Soba soba) {
        System.out.println("Updating room " + id);
             
        soba.setId(id);
        sobaDao.editSobu(soba);
        return new ResponseEntity<Soba>(soba, HttpStatus.OK);
    }
      
    //metoda koja po id-u nalazi i brise produkt iz baze
    @RequestMapping(value = "/soba/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Soba> deleteProduct(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting room with id " + id);
 
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            System.out.println("Unable to delete. Room with id " + id + " not found");
            return new ResponseEntity<Soba>(HttpStatus.NOT_FOUND);
        }
 
        sobaDao.deleteSobu(soba);
        return new ResponseEntity<Soba>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/korisnici", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Korisnik>> getAllUsers() {
        System.out.println("Fetching categories");
        List<Korisnik> korisnici = korisnikDao.getAllKorisnici();
        if (korisnici.size() == 0) {
            System.out.println("Category list empty");
            return new ResponseEntity<List<Korisnik>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Korisnik>>(korisnici, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/korisnik/{username}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Korisnik> getUser(@PathVariable("username") String username) {
        System.out.println("Fetching user with username: " + username);
        Korisnik c = korisnikDao.getKorisnikByName(username);
        if (c == null) {
            System.out.println("User with " + username + " not found");
            return new ResponseEntity<Korisnik>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Korisnik>(c, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/korisnik/", method = RequestMethod.POST)
    public ResponseEntity<Void> addUser(@RequestBody Korisnik k) {
        System.out.println("Adding category " + k.toString());
        korisnikDao.addKorisnika(k);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
      
    @RequestMapping(value = "/korisnik/{username}", method = RequestMethod.PUT)
    public ResponseEntity<Korisnik> updateUser(@PathVariable("username") String username, @RequestBody Korisnik k) {
        System.out.println("Updating category " + username);
             
        k.setUsername(username);
        korisnikDao.editKorisnika(k);
        return new ResponseEntity<Korisnik>(k, HttpStatus.OK);
    }
      
    @RequestMapping(value = "/korisnik/{username}", method = RequestMethod.DELETE)
    public ResponseEntity<Korisnik> deleteUser(@PathVariable("username") String username) {
        System.out.println("Fetching & Deleting category with id " + username);
 
        Korisnik k = korisnikDao.getKorisnikByName(username);
        if (k == null) {
            System.out.println("Unable to delete. User with username: " + username + ", not found");
            return new ResponseEntity<Korisnik>(HttpStatus.NOT_FOUND);
        }
 
        korisnikDao.deleteKorisnika(k);
        return new ResponseEntity<Korisnik>(HttpStatus.OK);
    }
 
    
}
    

