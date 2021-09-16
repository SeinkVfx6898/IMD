/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.impl;

import com.arelance.empresa.dao.servicios.ActividadService;
import com.arelance.empresa.imd.dao.ActividadDAO;
import com.arelance.empresa.imd.domain.Actividad;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class ActividadServiceImpl implements ActividadService {

    @Inject
    private ActividadDAO actividadDAO;

    @Override
    public List<Actividad> ListarActividades() {
        return actividadDAO.ListarActividades();
    }

    @Override
    public Actividad EncontrarActividadPorID(Actividad actividad) {
        return actividadDAO.EncontrarActividadPorID(actividad);
    }

    @Override
    public void AñadirCliente(Actividad actividad) {
     actividadDAO.AñadirActividad(actividad);
    }

    @Override
    public void ModificarCliente(Actividad actividad) {
     actividadDAO.ModificarActividad(actividad);
    }

    @Override
    public void RemoverCliente(Actividad actividad) {
       actividadDAO.RemoverActividad(actividad);
    }

}
