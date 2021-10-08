/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;



import com.arelance.empresa.DTO.ActividadesInscritoDTO;
import com.arelance.empresa.imd.dao.ActividadesInscritoDTODAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
@Stateless
public class ActividadesInscritoDTODAOImpl implements ActividadesInscritoDTODAO{

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;
     
    @Override
    public List<ActividadesInscritoDTO> ListaActividadesCliente(int id_cliente) {
        Query query = em.createQuery("select actividad.nombre from actividad inner join inscripciontarjeta "
                + "on actividad.id_actividad = inscripciontarjeta.Actividad_id_actividad inner join cliente "
                + "on inscripciontarjeta.Cliente_id_cliente = cliente.id_cliente where cliente.id_cliente = " + id_cliente , ActividadesInscritoDTO.class);
        return (List<ActividadesInscritoDTO>) query.getResultList();
    }

   
}
