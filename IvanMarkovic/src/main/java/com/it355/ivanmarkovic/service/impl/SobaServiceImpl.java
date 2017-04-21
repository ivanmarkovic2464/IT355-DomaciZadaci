/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.service.impl;

import com.it355.ivanmarkovic.dao.SobaDao;
import com.it355.ivanmarkovic.model.Soba;
import com.it355.ivanmarkovic.service.SobaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ivan
 */
public class SobaServiceImpl implements SobaService{

    @Autowired
    SobaDao sobaDao;
    
    @Override
    public boolean addSoba(Soba soba) {
        return sobaDao.addSoba(soba);
    }

    @Override
    public List<Soba> getAllRooms() {
       return sobaDao.getAllRooms();
    }

    @Override
    public int getCount() {
        return sobaDao.getCount();
    }

}
