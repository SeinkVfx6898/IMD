/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.DTO.ActividadesInscritoDTO;
import com.arelance.empresa.imd.dao.ActividadesInscritoDTODAO;
import com.arelance.empresa.servicios.ActividadesInscritoDTOService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class ActividadInscritoDTOServiceImpl implements ActividadesInscritoDTOService {

    @Inject
    private ActividadesInscritoDTODAO actividadesInscritoDTODAO;

    @Override
    public List<ActividadesInscritoDTO> ListaActividadesCliente(int id_cliente) {
        return actividadesInscritoDTODAO.ListaActividadesCliente(id_cliente);
    }

   

   

}
