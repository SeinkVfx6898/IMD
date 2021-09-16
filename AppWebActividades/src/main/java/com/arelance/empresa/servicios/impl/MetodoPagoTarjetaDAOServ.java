/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;


import java.util.List;
import com.arelance.empresa.imd.dao.IMetodoPagoTarjetaDAO;
import com.arelance.empresa.dao.implementaciones.MetodoPagoTarjetaDAOImpl;
import com.arelance.empresa.imd.beans.MetodoPagoTarjeta;
import javax.inject.Inject;

/**
 *
 * @author Manuel
 */
public class MetodoPagoTarjetaDAOServ implements IMetodoPagoTarjetaDAO{

    @Inject
    private MetodoPagoTarjetaDAOImpl metodoPagoTarjetaDAO;

    @Override
    public List<MetodoPagoTarjeta> obtener() {
        return metodoPagoTarjetaDAO.obtener();
    }

    @Override
    public boolean guardar(MetodoPagoTarjeta metodoPagoTarjeta) {
        return metodoPagoTarjetaDAO.guardar(metodoPagoTarjeta);
    }
    
}
