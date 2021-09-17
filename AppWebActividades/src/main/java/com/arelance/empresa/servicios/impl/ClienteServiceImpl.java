/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;

import com.arelance.empresa.imd.domain.Cliente;
import java.util.List;
import javax.inject.Inject;
import com.arelance.empresa.imd.dao.ClienteDAO;
import com.arelance.empresa.servicios.ClienteService;

/**
 *
 * @author Manuel
 */
public class ClienteServiceImpl implements ClienteService {
    
    @Inject
    private ClienteDAO clienteDAO;
    
    @Override
    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }
    
    @Override
    public Cliente EncontrarClientePorEmail(Cliente cliente) {
        return clienteDAO.EncontrarClientePorEmail(cliente);
    }
    
    @Override
    public Cliente EncontrarClientePorID(Cliente cliente) {
        return clienteDAO.EncontrarClientePorID(cliente);
    }
    
    @Override
    public Cliente EncontrarClientePorNick(Cliente cliente) {
        return clienteDAO.EncontrarClientePorNick(cliente);
    }
    
    @Override
    public void AñadirCliente(Cliente cliente) {
        clienteDAO.AñadirCliente(cliente);
    }
    
    @Override
    public void ModificarCliente(Cliente cliente) {
        clienteDAO.ModificarCliente(cliente);
    }
    
    @Override
    public void RemoverCliente(Cliente cliente) {
        clienteDAO.RemoverCliente(cliente);
    }
    
}
