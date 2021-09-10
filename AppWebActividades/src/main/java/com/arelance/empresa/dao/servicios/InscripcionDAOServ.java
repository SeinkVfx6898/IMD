/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;


import java.util.List;
import com.arelance.empresa.dao.interfaces.IInscripcionDAO;
import com.arelance.empresa.dao.implementaciones.InscripcionDAOImpl;
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
