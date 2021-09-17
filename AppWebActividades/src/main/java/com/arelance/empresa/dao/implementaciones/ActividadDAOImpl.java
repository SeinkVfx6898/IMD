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
import com.arelance.empresa.imd.dao.IActividadDAO;

/**
 *
 * @author lenovo
 */
@Stateless
public class ActividadDAOImpl implements IActividadDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Actividad> ListarActividades() {
        return em.createNamedQuery("Actividad.findAll").getResultList();
    }

    @Override
    public Actividad EncontrarActividadPorID(Actividad actividad) {
        return em.find(Actividad.class, actividad.getIdActividad());
    }

    @Override
    public void AñadirActividad(Actividad actividad) {
        em.persist(actividad);
    }

    @Override
    public void ModificarActividad(Actividad actividad) {
        em.merge(actividad);
    }

    @Override
    public void RemoverActividad(Actividad actividad) {
        em.remove(em.merge(actividad));
    }

}
