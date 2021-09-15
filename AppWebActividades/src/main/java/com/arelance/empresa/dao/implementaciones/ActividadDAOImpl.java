/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.imd.beans.Actividad;
import java.util.List;
import com.arelance.empresa.dao.interfaces.IActividadDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Manuel
 */
@Stateless
public class ActividadDAOImpl implements IActividadDAO{
    @PersistenceContext(unitName = "sgaPU")
    EntityManager em;
    
    @Override
    public List<Actividad> obtener() {
       return  em.createNamedQuery("Actividad.findAll").getResultList();
    }

    @Override
    public Actividad obtenerPorId(int id) {
        return em.find(Actividad.class, id);
    }
}

