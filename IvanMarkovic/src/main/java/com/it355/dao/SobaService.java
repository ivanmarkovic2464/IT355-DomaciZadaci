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
public interface SobaService {
    public void addSoba();
    public String addSobaRet();
    public void addSobaSaIzuzetkom() throws Exception;
    public void addSobaAround(int brojKreveta);
}
