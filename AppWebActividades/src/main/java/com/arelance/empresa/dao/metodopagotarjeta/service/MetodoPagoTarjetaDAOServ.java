/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.metodopagotarjeta.service;


import java.util.List;
import com.arelance.empresa.dao.metodopagotarjeta.IMetodoPagoTarjetaDAO;
import com.arelance.empresa.dao.metodopagotarjeta.impl.MetodoPagoTarjetaDAOImpl;
import com.arelance.empresa.imd.beans.MetodoPagoTarjeta;

/**
 *
 * @author Manuel
 */
public class MetodoPagoTarjetaDAOServ implements IMetodoPagoTarjetaDAO{

    private IMetodoPagoTarjetaDAO metodoPagoTarjetaDAO = new MetodoPagoTarjetaDAOImpl();

    @Override
    public List<MetodoPagoTarjeta> obtener() {
        return metodoPagoTarjetaDAO.obtener();
    }

    @Override
    public boolean guardar(MetodoPagoTarjeta metodoPagoTarjeta) {
        return metodoPagoTarjetaDAO.guardar(metodoPagoTarjeta);
    }
    
}
