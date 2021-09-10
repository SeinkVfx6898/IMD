/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.interfaces;


import com.arelance.empresa.imd.beans.InscripcionTarjeta;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface IInscripcionTarjetaDAO {
    
    public List<InscripcionTarjeta> obtener();
    public boolean guardar(InscripcionTarjeta inscripcionTarjeta);
    
}
