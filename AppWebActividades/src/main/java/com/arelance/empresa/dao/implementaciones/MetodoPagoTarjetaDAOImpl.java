/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import com.arelance.empresa.imd.dao.IMetodoPagoTarjetaDAO;
import java.util.List;
import com.arelance.empresa.imd.beans.MetodoPagoTarjeta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class MetodoPagoTarjetaDAOImpl implements IMetodoPagoTarjetaDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;
    
    @Override
    public List<MetodoPagoTarjeta> obtener() {
        return  em.createNamedQuery("MetodoPagoTarjeta.findAll").getResultList();

    }

    @Override
    public boolean guardar(MetodoPagoTarjeta metodoPagoTarjeta) {
        em.persist(metodoPagoTarjeta);
        return true;
    }

}
