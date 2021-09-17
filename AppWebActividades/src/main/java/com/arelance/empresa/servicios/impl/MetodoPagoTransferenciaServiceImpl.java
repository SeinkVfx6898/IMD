/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;


import java.util.List;
import com.arelance.empresa.imd.dao.IMetodoPagoTransferenciaDAO;
import com.arelance.empresa.imd.domain.Metodopagotransferencia;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class MetodoPagoTransferenciaServiceImpl implements IMetodoPagoTransferenciaDAO {
    
    @Inject
    private IMetodoPagoTransferenciaDAO metodoPagoTransferenciaDAO;
    
    @Override
    public List<Metodopagotransferencia> obtener() {
        return metodoPagoTransferenciaDAO.obtener();
    }

    @Override
    public void guardar(Metodopagotransferencia metodopagotransferencia) {
       metodoPagoTransferenciaDAO.guardar(metodopagotransferencia);
    }

}
