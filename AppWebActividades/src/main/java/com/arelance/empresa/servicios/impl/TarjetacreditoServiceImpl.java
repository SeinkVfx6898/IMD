/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;

import java.util.List;
import com.arelance.empresa.imd.dao.ITarjetaCreditoDAO;
import com.arelance.empresa.imd.domain.Tarjetacredito;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class TarjetacreditoServiceImpl implements ITarjetaCreditoDAO {

    @Inject
    private ITarjetaCreditoDAO tarjetaCreditoDAO;

    @Override
    public List<Tarjetacredito> obtener() {
        return tarjetaCreditoDAO.obtener();
    }

    @Override
    public void guardar(Tarjetacredito tarjetaCredito) {
      tarjetaCreditoDAO.guardar(tarjetaCredito);
    }

}
