/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import com.arelance.empresa.DTO.TransferenciaDTO;
import com.arelance.empresa.imd.dao.TransferenciaDTODAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
@Stateless
public class TransferenciaDTODAOImpl implements TransferenciaDTODAO{

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;
     
    @Override
    public TransferenciaDTO DatosCliente(int id_cliente) {
        Query query = em.createQuery("select iban from transferencia where id_transferencia="
                + "(select Transferencia_id_transferencia from metodopagotransferencia where idmetodopagotransferencia = "
                + "(select metodopagotransferencia_idmetodopagotransferencia from inscripciontransferencia where Cliente_id_cliente = " + id_cliente + " LIMIT 1 ))", TransferenciaDTO.class);
        return (TransferenciaDTO) query.getSingleResult();
    }

   
}