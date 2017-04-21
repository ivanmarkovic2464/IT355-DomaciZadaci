/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.service;

import com.it355.ivanmarkovic.model.Soba;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface SobaService {
    public boolean addSoba(Soba soba);
    public List<Soba> getAllRooms();
    public int getCount();
}
