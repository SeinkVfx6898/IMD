/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;


import java.util.List;

import com.arelance.empresa.imd.domain.Metodopagotarjeta;
import com.arelance.empresa.servicios.MetodoPagoTarjetaService;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class MetodoPagoTarjetaServiceImpl implements MetodoPagoTarjetaService {
    
    @Inject
    private MetodoPagoTarjetaService metodoPagoTarjetaService;
    
    @Override
    public List<Metodopagotarjeta> obtener() {
        return metodoPagoTarjetaService.obtener();
    }

    @Override
    public void guardar(Metodopagotarjeta metodopagotarjeta) {
       metodoPagoTarjetaService.guardar(metodopagotarjeta);
    }

}
