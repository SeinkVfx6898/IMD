/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;


import java.util.List;
import com.arelance.empresa.dao.interfaces.IInscripcionTarjetaDAO;
import com.arelance.empresa.dao.implementaciones.InscripcionTarjetaDAOImpl;
import com.arelance.empresa.imd.beans.InscripcionTarjeta;

/**
 *
 * @author Manuel
 */
public class InscripcionTarjetaDAOServ implements IInscripcionTarjetaDAO{

    private IInscripcionTarjetaDAO inscripcionTarjetaDAO = new InscripcionTarjetaDAOImpl();

    @Override
    public List<InscripcionTarjeta> obtener() {
        return inscripcionTarjetaDAO.obtener();
    }

    @Override
    public boolean guardar(InscripcionTarjeta inscripcionTarjeta) {
        return inscripcionTarjetaDAO.guardar(inscripcionTarjeta);
    }

}
