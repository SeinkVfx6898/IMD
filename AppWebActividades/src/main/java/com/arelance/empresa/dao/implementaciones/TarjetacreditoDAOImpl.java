/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.imd.domain.Actividad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.arelance.empresa.imd.dao.TarjetaCreditoDAO;
import com.arelance.empresa.imd.domain.Tarjetacredito;

/**
 *
 * @author lenovo
 */
@Stateless
public class TarjetacreditoDAOImpl implements TarjetaCreditoDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Tarjetacredito> obtener() {
        return em.createNamedQuery("Tarjetacredito.findAll").getResultList();
    }

    @Override
    public void guardar(Tarjetacredito tarjetaCredito) {
       em.persist(tarjetaCredito);
    }

}
