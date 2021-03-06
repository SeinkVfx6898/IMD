/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.imd.domain.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.arelance.empresa.imd.dao.ClienteDAO;

/**
 *
 * @author Manuel
 */
@Stateless
public class ClienteDAOImpl implements ClienteDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Cliente> listarClientes() {
        return em.createNamedQuery("Cliente.findAll").getResultList();
    }

    @Override
    public Cliente EncontrarClientePorEmail(Cliente cliente) {
  return (Cliente) em.createNamedQuery("Cliente.findByEmail").getSingleResult();
    }

    @Override
    public Cliente EncontrarClientePorID(Cliente cliente) {
        return em.find(Cliente.class, cliente.getIdCliente());
    }

    @Override
    public Cliente EncontrarClientePorNick(Cliente cliente) {
     return (Cliente) em.createNamedQuery("Cliente.findByNick").getSingleResult();
    }

    @Override
    public void AñadirCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void ModificarCliente(Cliente cliente) {
        em.merge(cliente);
    }
    
    @Override
    public void RemoverCliente(Cliente cliente) {
        em.remove(em.merge(cliente));
    }
}
