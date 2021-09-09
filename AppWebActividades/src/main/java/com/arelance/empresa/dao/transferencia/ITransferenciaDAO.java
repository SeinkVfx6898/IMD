/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.transferencia;


import com.arelance.empresa.imd.beans.Transferencia;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface ITransferenciaDAO {
    
    public List<Transferencia> obtener();
    public boolean guardar(Transferencia transferencia);
    
}
