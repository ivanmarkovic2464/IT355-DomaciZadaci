/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.dao;

import com.it355.ivanmarkovic.model.Soba;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface SobaDao {
<<<<<<< HEAD
    public Soba addSoba(Soba soba);
    public void editSobu(Soba soba);
    public List<Soba> getAllRooms();
    public int getCountSobe();
    public void deleteSobu(Soba soba);
    public Soba getSobaById(int id);
=======
    public boolean addSoba(Soba soba);
    public List<Soba> getAllRooms();
    public int getCount();
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
}
