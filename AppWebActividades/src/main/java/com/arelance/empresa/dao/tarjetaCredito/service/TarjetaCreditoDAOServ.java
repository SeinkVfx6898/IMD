/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.tarjetaCredito.service;


import java.util.List;
import com.arelance.empresa.dao.tarjetaCredito.ITarjetaCreditoDAO;
import com.arelance.empresa.dao.tarjetaCredito.impl.TarjetaCreditoDAOImpl;
import com.arelance.empresa.imd.beans.TarjetaCredito;

/**
 *
 * @author Manuel
 */
public class TarjetaCreditoDAOServ implements ITarjetaCreditoDAO{

    private ITarjetaCreditoDAO tarjetaCreditoDAO = new TarjetaCreditoDAOImpl();

    @Override
    public List<TarjetaCredito> obtener() {
        return tarjetaCreditoDAO.obtener();
    }

    @Override
    public boolean guardar(TarjetaCredito tarjetaCredito) {
        return tarjetaCreditoDAO.guardar(tarjetaCredito);
    }
    
}
