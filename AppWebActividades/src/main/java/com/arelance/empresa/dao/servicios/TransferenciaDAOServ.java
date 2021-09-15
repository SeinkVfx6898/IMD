/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;


import java.util.List;
import com.arelance.empresa.dao.interfaces.ITransferenciaDAO;
import com.arelance.empresa.dao.implementaciones.TransferenciaDAOImpl;
import com.arelance.empresa.imd.beans.Transferencia;
import javax.inject.Inject;

/**
 *
 * @author Manuel
 */
public class TransferenciaDAOServ implements ITransferenciaDAO{

    @Inject
    private TransferenciaDAOImpl transferenciaDAO;

    @Override
    public List<Transferencia> obtener() {
        return transferenciaDAO.obtener();
    }

    @Override
    public boolean guardar(Transferencia transferencia) {
        return transferenciaDAO.guardar(transferencia);
    }
    
}
