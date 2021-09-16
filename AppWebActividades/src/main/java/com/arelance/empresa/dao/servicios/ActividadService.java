/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;

import com.arelance.empresa.imd.domain.Actividad;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ActividadService {

    public List<Actividad> ListarActividades();//Obtener todas las actividades

    public Actividad EncontrarActividadPorID(Actividad actividad);//Encontrar actividad por id.

    public void AñadirCliente(Actividad actividad);//Añadir actividades.

    public void ModificarCliente(Actividad actividad);//Modificar actividades.

    public void RemoverCliente(Actividad actividad);//Remover actividades.
}
