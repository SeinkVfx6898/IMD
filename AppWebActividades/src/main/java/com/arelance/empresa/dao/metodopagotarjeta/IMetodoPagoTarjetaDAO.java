/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.metodopagotarjeta;



import com.arelance.empresa.imd.beans.MetodoPagoTarjeta;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface IMetodoPagoTarjetaDAO {
    
    public List<MetodoPagoTarjeta> obtener();
    public boolean guardar(MetodoPagoTarjeta  metodopagotarjeta);
    
}
