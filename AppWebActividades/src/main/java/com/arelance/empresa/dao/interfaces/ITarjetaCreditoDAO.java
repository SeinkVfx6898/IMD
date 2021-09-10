/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.interfaces;


import com.arelance.empresa.imd.beans.TarjetaCredito;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface ITarjetaCreditoDAO {
    
    public List<TarjetaCredito> obtener();
    public boolean guardar(TarjetaCredito tarjetaCredito);
    
}
