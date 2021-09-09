/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.transferencia.service;


import java.util.List;
import com.arelance.empresa.dao.transferencia.ITransferenciaDAO;
import com.arelance.empresa.dao.transferencia.impl.TransferenciaDAOImpl;
import com.arelance.empresa.imd.beans.Transferencia;

/**
 *
 * @author Manuel
 */
public class TransferenciaDAOServ implements ITransferenciaDAO{

    private ITransferenciaDAO transferenciaDAO = new TransferenciaDAOImpl();

    @Override
    public List<Transferencia> obtener() {
        return transferenciaDAO.obtener();
    }

    @Override
    public boolean guardar(Transferencia transferencia) {
        return transferenciaDAO.guardar(transferencia);
    }
    
}
