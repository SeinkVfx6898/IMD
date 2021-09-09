/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.inscripcion;


import com.arelance.empresa.imd.beans.Inscripcion;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface IInscripcionDAO {
    
    public List<Inscripcion> obtener();
    public boolean guardar(Inscripcion inscripcion);
    
}
