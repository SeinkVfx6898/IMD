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
import com.arelance.empresa.imd.dao.ActividadDAO;
import javax.persistence.Query;

/**
 *
 * @author lenovo
 */
@Stateless
public class ActividadDAOImpl implements ActividadDAO {

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

    @Override
    public Actividad EncontrarActividadPorID(int id) {
        return em.find(Actividad.class, id);
    }

    @Override
    public List<Actividad> ListaActividadesCliente(int id_cliente) {
        String sql = "select actividad.* from actividad inner join inscripciontarjeta "
                + "on actividad.id_actividad = inscripciontarjeta.Actividad_id_actividad inner join cliente "
                + "on inscripciontarjeta.Cliente_id_cliente = cliente.id_cliente where cliente.id_cliente = " + id_cliente;
        Query query = em.createNativeQuery(sql);
        return query.getResultList();
    }

}
