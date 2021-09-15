/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.dao.interfaces.LoginDAO;
import com.arelance.empresa.imd.beans.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 *
 * @author lenovo
 */
@Stateless
public class LoginDAOImpl implements LoginDAO<Cliente> {

    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;

    @Override
    public Cliente Verificar(Cliente cliente) {
        Query query =em.createQuery("from Cliente c where c.nick= :nick and c.password= :password");
        query.setParameter("nick", cliente.getNick());
        query.setParameter("password", cliente.getPassword());
        return (Cliente) query.getSingleResult();
    }

    @Override
    public Boolean Registrar(Cliente cliente) {
        ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
        return clienteDAOImpl.guardar(cliente);
    }

}
