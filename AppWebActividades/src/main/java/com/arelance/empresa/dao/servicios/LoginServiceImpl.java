/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;

import com.arelance.empresa.dao.implementaciones.LoginDAOImpl;
import com.arelance.empresa.imd.beans.Cliente;
import java.util.List;

/**
 *
 * @author lenovo
 */

public class LoginServiceImpl implements LoginService<Cliente>{
LoginDAOImpl loginDAOImpl=new LoginDAOImpl();

    @Override
    public List<Cliente> verificar(Cliente cliente) {
        return loginDAOImpl.Verificar(cliente);
    }

    @Override
    public Boolean Registrar(Cliente cliente) {
        return loginDAOImpl.Registrar(cliente);
    }


    
}
