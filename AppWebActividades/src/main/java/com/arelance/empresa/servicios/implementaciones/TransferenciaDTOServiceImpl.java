/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.DTO.TransferenciaDTO;
import com.arelance.empresa.imd.dao.TransferenciaDTODAO;
import com.arelance.empresa.servicios.TransferenciaDTOService;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class TransferenciaDTOServiceImpl implements TransferenciaDTOService {

    @Inject
    private TransferenciaDTODAO transferenciaDTODAO;

    @Override
    public TransferenciaDTO DatosCliente(int id_cliente) {
        return transferenciaDTODAO.DatosCliente(id_cliente);
    }

   

}
