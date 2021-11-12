/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.imd.dao.InscripcionTransferenciaDAO;
import com.arelance.empresa.imd.domain.Inscripciontransferencia;
import com.arelance.empresa.imd.domain.Metodopagotransferencia;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuar
 */
@Stateless
public class InscripcionTransferenciaDAOImpl implements InscripcionTransferenciaDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Inscripciontransferencia> obtener() {
        return em.createNamedQuery("Inscripciontransferencia.findAll").getResultList();
    }

    @Override
    public void guardar(Inscripciontransferencia inscripciontransferencia) {
        em.persist(inscripciontransferencia);
    }

    @Override
    public void modificar(Inscripciontransferencia inscripciontransferencia) {
        em.merge(inscripciontransferencia);
    }

    @Override
    public void eliminar(Inscripciontransferencia inscripciontransferencia) {
        em.remove(em.merge(inscripciontransferencia));
    }

    @Override
    public Metodopagotransferencia ObtenerIdTransferencia() {
             String sql = "SELECT idmetodopagotransferencia FROM institutomd_bd.metodopagotransferencia order by idmetodopagotransferencia desc limit 1";
        return (Metodopagotransferencia) em.createNativeQuery(sql,Metodopagotransferencia.class).getSingleResult();
    }
        @Override
    public Inscripciontransferencia ObtenerInscripcion(int cliente,int actividad){
    String sql="SELECT inscripciontransferencia.id_cliente,inscripciontransferencia.id_actividad,inscripciontransferencia.id_metodopagotransferencia FROM inscripciontransferencia WHERE inscripciontransferencia.id_cliente="+cliente+" AND inscripciontransferencia.id_actividad="+actividad+"";
    return(Inscripciontransferencia)em.createNativeQuery(sql,Inscripciontransferencia.class).getSingleResult();
    }

}