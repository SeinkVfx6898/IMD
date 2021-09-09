/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.inscripcion.service;


import java.util.List;
import com.arelance.empresa.dao.inscripcion.IInscripcionDAO;
import com.arelance.empresa.dao.inscripcion.impl.InscripcionDAOImpl;
import com.arelance.empresa.imd.beans.Inscripcion;

/**
 *
 * @author Manuel
 */
public class InscripcionDAOServ implements IInscripcionDAO{

    private IInscripcionDAO inscripcionDao = new InscripcionDAOImpl();

    @Override
    public List<Inscripcion> obtener() {
        return inscripcionDao.obtener();
    }

    @Override
    public boolean guardar(Inscripcion inscripcion) {
        return inscripcionDao.guardar(inscripcion);
    }

}
