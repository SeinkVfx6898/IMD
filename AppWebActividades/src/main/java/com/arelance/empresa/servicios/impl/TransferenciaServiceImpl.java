/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;

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
    private TransferenciaService transferenciaService;

    @Override
    public List<Transferencia> obtener() {
        return transferenciaService.obtener();
    }

    @Override
    public void guardar(Transferencia transferencia) {
        transferenciaService.guardar(transferencia);
    }

}
