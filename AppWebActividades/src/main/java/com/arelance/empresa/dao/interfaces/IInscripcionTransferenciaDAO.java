/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.interfaces;


import com.arelance.empresa.imd.beans.InscripcionTransferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface IInscripcionTransferenciaDAO {
    
    public List<InscripcionTransferencia> obtener();
    public boolean guardar(InscripcionTransferencia inscripcionTransferencia);
    
}
