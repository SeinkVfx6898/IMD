/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.imd.domain.Cliente;
import java.util.List;
import javax.inject.Inject;
import com.arelance.empresa.servicios.ClienteService;
import com.arelance.empresa.imd.dao.ClienteDAO;

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
    public Cliente EncontrarClientePorID(int id) {
        return clienteDAO.EncontrarClientePorID(id);
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

    @Override
    public Cliente EncontrarClientePorPassword(Cliente cliente) {
        return clienteDAO.EncontrarClientePorPassword(cliente);
    }

    @Override
    public Cliente ValidarCliente(Cliente cliente) {
        return clienteDAO.ValidarCliente(cliente);
    }

     @Override
    public Cliente SacarID(Cliente cliente) {
       return clienteDAO.SacarID(cliente);
    }

    @Override
    public Cliente EncontrarClientePorTelefono(Cliente cliente) {
        return clienteDAO.EncontrarClientePorTelefono(cliente);
    }

    @Override
    public Cliente EncontrarClientePorEmail(Cliente cliente) {
        return clienteDAO.EncontrarClientePorEmail(cliente);
    }

    @Override
    public Cliente ValidarRegistro(Cliente cliente) {
       return clienteDAO.ValidarRegistro(cliente);
    }

    @Override
    public Cliente EncontradIdNick(String nick) {
        return clienteDAO.EncontradIdNick(nick);
    }

    
}
