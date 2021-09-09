/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.actividad.impl;

import com.arelance.empresa.imd.beans.Actividad;
import com.arelance.empresa.imd.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.arelance.empresa.dao.actividad.ActividadDAO;


/**
 *
 * @author Manuel
 */
public class ActividadDAOImpl implements ActividadDAO{
    
    @Override
    public List<Actividad> obtener() {
        ResultSet rs;

        String sql="SELECT id_actividad, nombre, descripción, entrenador, precio, dia_semana, hora_inicio, hora_fin FROM actividad";

        List<Actividad> listaActividad= new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Actividad a=new Actividad();
                    a.setIdActividad(rs.getInt(1));
                    a.setNombre(rs.getString(2));
                    a.setDescripcion(rs.getString(3));
                    a.setEnternador(rs.getString(4));
                    a.setPrecio(rs.getDouble(5));
                    a.setDiaSemana(rs.getString(6));
                    a.setHoraInicio(rs.getString(7));
                    a.setHoraFin(rs.getString(8));
                    listaActividad.add(a);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase ActividadDaoImple, método obtener");
        }
        return listaActividad;

    }

}
