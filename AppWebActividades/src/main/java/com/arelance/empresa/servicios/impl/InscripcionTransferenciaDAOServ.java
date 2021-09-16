/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;


import java.util.List;
import com.arelance.empresa.imd.dao.IInscripcionTransferenciaDAO;
import com.arelance.empresa.dao.implementaciones.InscripcionTransferenciaDAOImpl;
import com.arelance.empresa.imd.beans.InscripcionTransferencia;
import javax.inject.Inject;

/**
 *
 * @author Manuel
 */
public class InscripcionTransferenciaDAOServ implements IInscripcionTransferenciaDAO{

    @Inject
    private InscripcionTransferenciaDAOImpl inscripcionTransferenciaDAO;

    @Override
    public List<InscripcionTransferencia> obtener() {
        return inscripcionTransferenciaDAO.obtener();
    }

    @Override
    public boolean guardar(InscripcionTransferencia inscripcionTransferencia) {
        return inscripcionTransferenciaDAO.guardar(inscripcionTransferencia);
    }

}
