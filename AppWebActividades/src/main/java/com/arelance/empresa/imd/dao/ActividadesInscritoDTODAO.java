/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.dao;


import com.arelance.empresa.DTO.ActividadesInscritoDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lenovo
 */
@Local
public interface ActividadesInscritoDTODAO {

    public List<ActividadesInscritoDTO> ListaActividadesCliente(int id_cliente);//Obtener las actividades que esta apuntado un usuario


}
