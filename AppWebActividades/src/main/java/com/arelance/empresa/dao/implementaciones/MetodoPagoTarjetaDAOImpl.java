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
import com.arelance.empresa.imd.dao.MetodoPagoTarjetaDAO;
import com.arelance.empresa.imd.domain.Metodopagotarjeta;

/**
 *
 * @author lenovo
 */
@Stateless
public class MetodoPagoTarjetaDAOImpl implements MetodoPagoTarjetaDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Metodopagotarjeta> obtener() {
        return em.createNamedQuery("Metodopagotarjeta.findAll").getResultList();
    }

    @Override
    public void AñadirPagoTarjeta(Metodopagotarjeta metodopagotarjeta) {
       em.persist(metodopagotarjeta);
    }

    @Override
    public void ModificarPagoTarjeta(Metodopagotarjeta metodopagotarjeta) {
        em.merge(metodopagotarjeta);
    }

    @Override
    public void RemoverPagoTarjeta(Metodopagotarjeta metodopagotarjeta) {
        em.remove(em.merge(metodopagotarjeta));
    }

}
