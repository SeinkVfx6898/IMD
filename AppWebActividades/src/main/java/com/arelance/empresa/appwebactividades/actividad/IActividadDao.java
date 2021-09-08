/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.appwebactividades.actividad;

import com.arelance.empresa.appwebactividades.beans.Actividad;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface IActividadDao {

    public List<Actividad> obtener();
}
