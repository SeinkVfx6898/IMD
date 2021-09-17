/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;

import java.util.List;
import com.arelance.empresa.imd.dao.ITransferenciaDAO;
import com.arelance.empresa.imd.domain.Transferencia;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class TransferenciaServiceImpl implements ITransferenciaDAO {

    @Inject
    private ITransferenciaDAO transferenciaDAO;

    @Override
    public List<Transferencia> obtener() {
        return transferenciaDAO.obtener();
    }

    @Override
    public void guardar(Transferencia transferencia) {
      transferenciaDAO.guardar(transferencia);
    }

}
