/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;

import com.arelance.empresa.DTO.TransferenciaDTO;
import javax.ejb.Local;

/**
 *
 * @author lenovo
 */
@Local
public interface TransferenciaDTOService {

   public TransferenciaDTO DatosCliente(int id_cliente);//Obtener los datos de transferencia de un usuario


}