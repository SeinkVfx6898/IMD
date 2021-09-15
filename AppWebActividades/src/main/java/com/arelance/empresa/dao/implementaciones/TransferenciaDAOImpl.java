/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import java.util.List;
import com.arelance.empresa.dao.interfaces.ITransferenciaDAO;
import com.arelance.empresa.imd.beans.Transferencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class TransferenciaDAOImpl implements ITransferenciaDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;
    
    @Override
    public List<Transferencia> obtener() {
         return  em.createNamedQuery("Transferencia.findAll").getResultList();
    }

    @Override
    public boolean guardar(Transferencia transferencia) {
        em.persist(transferencia);
        return true;
    }

}
