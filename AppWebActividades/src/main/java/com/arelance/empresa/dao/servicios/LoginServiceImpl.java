/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;

import com.arelance.empresa.dao.implementaciones.LoginDAOImpl;
import com.arelance.empresa.dao.interfaces.LoginDAO;
import com.arelance.empresa.imd.beans.Cliente;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */

public class LoginServiceImpl implements LoginDAO<Cliente>{

    @Inject
    private LoginDAOImpl loginDAOImpl;
    
    @Override
    public Cliente Verificar(Cliente cliente) {
        return loginDAOImpl.Verificar(cliente);
    }

    @Override
    public Boolean Registrar(Cliente cliente) {
        return loginDAOImpl.Registrar(cliente);
    }


    
}
