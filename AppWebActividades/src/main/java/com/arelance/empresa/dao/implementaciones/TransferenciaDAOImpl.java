/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.arelance.empresa.imd.dao.TransferenciaDAO;
import com.arelance.empresa.imd.domain.Transferencia;

/**
 *
 * @author lenovo
 */
@Stateless
public class TransferenciaDAOImpl implements TransferenciaDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Transferencia> obtener() {
        return em.createNamedQuery("Transferencia.findAll").getResultList();
    }

    @Override
    public void guardar(Transferencia transferencia) {
       em.persist(transferencia);
    }

}
