/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.dao;

import com.arelance.empresa.imd.domain.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface IClienteDAO {

    public List<Cliente> listarClientes();//Obtener clientes.

    public Cliente EncontrarClientePorEmail(Cliente cliente);//Encontrar por email.

    public Cliente EncontrarClientePorID(Cliente cliente);//Encontrar por email.

    public Cliente EncontrarClientePorNick(Cliente cliente);//Encontrar por nick.

    public void AñadirCliente(Cliente cliente);//Añadir clientes.

    public void ModificarCliente(Cliente cliente);//Modificar clientes.

    public void RemoverCliente(Cliente cliente);//Remover clientes.

}
