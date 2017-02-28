/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dao;

/**
 *
 * @author Ivan
 */
public class SobaServiceImpl implements SobaService{

    @Override
    public void addSoba() {
        System.out.println("Dodajem novu sobu.");
    }

    @Override
    public String addSobaRet() {
        System.out.println("Dodajem sobu i vraćam vrednost");
        return "<<Soba dodata>>";
    }

    @Override
    public void addSobaSaIzuzetkom() throws Exception {
        System.out.println("Dodajem sobu i izbacujem izuzetak");
        throw new Exception("Generic Error");
    }

    @Override
    public void addSobaAround(int brojKreveta) {
        System.out.println("Dodajem sobu sa "+brojKreveta+" kreveta.");
    }
    
}
