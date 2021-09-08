/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.actividad.service;

import com.arelance.empresa.dao.actividad.IActividadDao;
import com.arelance.empresa.dao.actividad.impl.ActividadDAOImpl;
import com.arelance.empresa.imd.beans.Actividad;

import java.util.List;

/**
 *
 * @author Manuel
 */
public class ActividadDAOServ implements IActividadDao{

    private IActividadDao articuloDao = new ActividadDAOImpl();

    @Override
    public List<Actividad> obtener() {
        return articuloDao.obtener();
    }
    
    

}
