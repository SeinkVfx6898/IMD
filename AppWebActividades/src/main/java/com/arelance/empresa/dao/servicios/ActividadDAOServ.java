/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;

import com.arelance.empresa.dao.implementaciones.ActividadDAOImpl;
import com.arelance.empresa.imd.beans.Actividad;

import java.util.List;
import com.arelance.empresa.dao.interfaces.IActividadDAO;

/**
 *
 * @author Manuel
 */
public class ActividadDAOServ implements IActividadDAO{

    private IActividadDAO actividadDao = new ActividadDAOImpl();

    @Override
    public List<Actividad> obtener() {
        return actividadDao.obtener();
    }
    
    

}
