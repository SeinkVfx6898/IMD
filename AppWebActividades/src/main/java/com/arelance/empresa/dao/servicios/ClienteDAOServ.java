/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;


import com.arelance.empresa.dao.implementaciones.ClienteDAOImpl;
import com.arelance.empresa.imd.beans.Cliente;
import java.util.List;
import com.arelance.empresa.dao.interfaces.IClienteDAO;
import javax.inject.Inject;

/**
 *
 * @author Manuel
 */
public class ClienteDAOServ implements IClienteDAO{

    @Inject
    private ClienteDAOImpl clienteDao;
        
    @Override
    public List<Cliente> obtener() {
        return clienteDao.obtener();
    }

    @Override
    public boolean guardar(Cliente cliente) {
        return clienteDao.guardar(cliente);
    }

    @Override
    public boolean actualizar(Cliente cliente) {
        return clienteDao.actualizar(cliente);
    }

}
