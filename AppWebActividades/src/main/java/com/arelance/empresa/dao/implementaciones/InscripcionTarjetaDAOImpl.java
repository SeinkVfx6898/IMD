/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import java.util.List;
import com.arelance.empresa.dao.interfaces.IInscripcionTarjetaDAO;
import com.arelance.empresa.imd.beans.InscripcionTarjeta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class InscripcionTarjetaDAOImpl implements IInscripcionTarjetaDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;
    
    @Override
    public List<InscripcionTarjeta> obtener() {
        return  em.createNamedQuery("InscripcionTarjeta.findAll").getResultList();
    }

    @Override
    public boolean guardar(InscripcionTarjeta inscripcionTarjeta) {
        em.persist(inscripcionTarjeta);
        return true;
    }

}
