/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;


import com.arelance.empresa.imd.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.arelance.empresa.dao.interfaces.IInscripcionDAO;
import com.arelance.empresa.imd.beans.Inscripcion;


/**
 *
 * @author Manuel
 */
public class InscripcionDAOImpl implements IInscripcionDAO{
    
    @Override
    public List<Inscripcion> obtener() {
        ResultSet rs;

        String sql="SELECT id_inscripcion, Cliente_id_cliente, Actividad_id_actividad, metodopagotarjeta_idmetodopagotarjeta, metodopagotransferencia_idmetodopagotransferencia FROM inscripcion";

        List<Inscripcion> listaInscripciones = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Inscripcion i=new Inscripcion();
                    i.setIdInscripcion(rs.getInt(1));
                    i.setCliente_id_cliente(rs.getInt(2));
                    i.setActividad_id_actividad(rs.getInt(3));
                    i.setMetodopagotarjeta_idmetodopagotarjeta(rs.getInt(4));
                    i.setMetodopagotransferencia_idmetodopagotransferencia(rs.getInt(5));
                    listaInscripciones.add(i);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase InscripcionDaoImple, método obtener");
        }
        return listaInscripciones;

    }

    @Override
    public boolean guardar(Inscripcion inscripcion) {
        String sql="INSERT INTO `inscripcion` (`Cliente_id_inscripcion`, `Actividad_id_actividad`, `metodopagotarjeta_idmetodopagotarjeta`,`metodopagotransferencia_idmetodopagotransferencia`) VALUES (" + inscripcion.getCliente_id_cliente()+ "," + inscripcion.getActividad_id_actividad()+ "," + inscripcion.getMetodopagotarjeta_idmetodopagotarjeta()+ "," + inscripcion.getMetodopagotransferencia_idmetodopagotransferencia()+ ")";
        boolean guardado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                guardado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase InscripcionDaoImple, método guardar");
        }
        return guardado;
    }

}
