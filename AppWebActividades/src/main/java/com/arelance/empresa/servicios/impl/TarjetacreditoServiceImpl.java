/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;

import java.util.List;
import com.arelance.empresa.imd.domain.Tarjetacredito;
import com.arelance.empresa.servicios.TarjetaCreditoService;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class TarjetacreditoServiceImpl implements TarjetaCreditoService {

    @Inject
    private TarjetaCreditoService tarjetaCreditoService;

    @Override
    public List<Tarjetacredito> obtener() {
        return tarjetaCreditoService.obtener();
    }

    @Override
    public void guardar(Tarjetacredito tarjetaCredito) {
      tarjetaCreditoService.guardar(tarjetaCredito);
    }

}
