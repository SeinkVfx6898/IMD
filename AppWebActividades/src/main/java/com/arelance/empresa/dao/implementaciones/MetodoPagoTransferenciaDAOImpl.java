/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import com.arelance.empresa.imd.dao.IMetodoPagoTransferenciaDAO;
import java.util.List;
import com.arelance.empresa.imd.beans.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class MetodoPagoTransferenciaDAOImpl implements IMetodoPagoTransferenciaDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;
    
    @Override
    public List<MetodoPagoTransferencia> obtener() {
        return  em.createNamedQuery("MetodoPagoTransferencia.findAll").getResultList();
    }

    @Override
    public boolean guardar(MetodoPagoTransferencia metodoPagoTransferencia) {
        em.persist(metodoPagoTransferencia);
        return true;
    }

}
