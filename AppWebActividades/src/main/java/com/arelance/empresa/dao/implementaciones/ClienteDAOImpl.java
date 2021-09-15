/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import com.arelance.empresa.imd.beans.Cliente;
import java.util.List;
import com.arelance.empresa.dao.interfaces.IClienteDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class ClienteDAOImpl implements IClienteDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;

     
    @Override
    public List<Cliente> obtener() {
        return  em.createNamedQuery("Cliente.findAll").getResultList();
    }

    @Override
    public boolean guardar(Cliente cliente) {                                                                                                                                                                                   
        em.persist(cliente);
        return true;
    }

    @Override
    public boolean actualizar(Cliente cliente) {
        em.merge(cliente);
        return true;
    }

}
