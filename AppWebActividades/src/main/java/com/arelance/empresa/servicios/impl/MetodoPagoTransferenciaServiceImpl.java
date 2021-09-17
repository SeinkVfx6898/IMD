/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;


import java.util.List;
import com.arelance.empresa.imd.domain.Metodopagotransferencia;
import com.arelance.empresa.servicios.MetodoPagoTransferenciaService;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class MetodoPagoTransferenciaServiceImpl implements MetodoPagoTransferenciaService {
    
    @Inject
    private MetodoPagoTransferenciaService metodoPagoTransferenciaService;
    
    @Override
    public List<Metodopagotransferencia> obtener() {
        return metodoPagoTransferenciaService.obtener();
    }

    @Override
    public void guardar(Metodopagotransferencia metodopagotransferencia) {
       metodoPagoTransferenciaService.guardar(metodopagotransferencia);
    }

}
