/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.metodopagotransferencia.service;


import java.util.List;
import com.arelance.empresa.dao.metodopagotransferencia.IMetodoPagoTransferenciaDAO;
import com.arelance.empresa.dao.metodopagotransferencia.impl.MetodoPagoTransferenciaDAOImpl;
import com.arelance.empresa.imd.beans.MetodoPagoTransferencia;

/**
 *
 * @author Manuel
 */
public class MetodoPagoTransferenciaDAOServ implements IMetodoPagoTransferenciaDAO{

    private IMetodoPagoTransferenciaDAO metodoPagoTransferenciaDAO = new MetodoPagoTransferenciaDAOImpl();

    @Override
    public List<MetodoPagoTransferencia> obtener() {
        return metodoPagoTransferenciaDAO.obtener();
    }

    @Override
    public boolean guardar(MetodoPagoTransferencia metodoPagoTransferencia) {
        return metodoPagoTransferenciaDAO.guardar(metodoPagoTransferencia);
    }
    
}
