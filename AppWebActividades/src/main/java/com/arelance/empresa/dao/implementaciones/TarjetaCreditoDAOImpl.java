/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import java.util.List;
import com.arelance.empresa.dao.interfaces.ITarjetaCreditoDAO;
import com.arelance.empresa.imd.beans.TarjetaCredito;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class TarjetaCreditoDAOImpl implements ITarjetaCreditoDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;
    
    @Override
    public List<TarjetaCredito> obtener() {
       return  em.createNamedQuery("TarjetaCredito.findAll").getResultList();

    }

    @Override
    public boolean guardar(TarjetaCredito tarjetaCredito) {
        em.persist(tarjetaCredito);
        return true;
    }

}
