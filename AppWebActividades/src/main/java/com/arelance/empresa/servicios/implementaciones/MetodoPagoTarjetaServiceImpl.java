/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;


import com.arelance.empresa.imd.dao.MetodoPagoTarjetaDAO;
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
    private MetodoPagoTarjetaDAO metodoPagoTarjetaDAO;
    
    @Override
    public List<Metodopagotarjeta> obtener() {
        return metodoPagoTarjetaDAO.obtener();
    }

    @Override
    public void guardar(Metodopagotarjeta metodopagotarjeta) {
       metodoPagoTarjetaDAO.guardar(metodopagotarjeta);
    }

}
