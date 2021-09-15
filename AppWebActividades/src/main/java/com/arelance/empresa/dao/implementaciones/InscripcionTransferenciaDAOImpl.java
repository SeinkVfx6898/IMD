/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import java.util.List;
import com.arelance.empresa.dao.interfaces.IInscripcionTransferenciaDAO;
import com.arelance.empresa.imd.beans.InscripcionTransferencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class InscripcionTransferenciaDAOImpl implements IInscripcionTransferenciaDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;
    
    @Override
    public List<InscripcionTransferencia> obtener() {
        return  em.createNamedQuery("InscripcionTransferencia.findAll").getResultList();

    }

    @Override
    public boolean guardar(InscripcionTransferencia inscripcionTransferencia) {
        em.persist(inscripcionTransferencia);
        return true;
    }

}
