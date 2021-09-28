/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.imd.dao.TransferenciaDAO;
import java.util.List;
import com.arelance.empresa.imd.domain.Transferencia;
import com.arelance.empresa.servicios.TransferenciaService;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class TransferenciaServiceImpl implements TransferenciaService {

    @Inject
    private TransferenciaDAO transferenciaDAO;

    @Override
    public List<Transferencia> obtener() {
        return transferenciaDAO.obtener();
    }

    @Override
    public void guardar(Transferencia transferencia) {
        transferenciaDAO.guardar(transferencia);
    }

}
