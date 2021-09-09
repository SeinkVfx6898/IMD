/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.cliente.service;


import com.arelance.empresa.dao.cliente.IClienteDao;
import com.arelance.empresa.dao.cliente.impl.ClienteDAOImpl;
import com.arelance.empresa.imd.beans.Cliente;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class ClienteDAOServ implements IClienteDao{

    private IClienteDao clienteDao = new ClienteDAOImpl();

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
