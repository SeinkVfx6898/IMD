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
import com.arelance.empresa.dao.interfaces.IInscripcionTarjetaDAO;
import com.arelance.empresa.imd.beans.InscripcionTarjeta;


/**
 *
 * @author Manuel
 */
public class InscripcionTarjetaDAOImpl implements IInscripcionTarjetaDAO{
    
    @Override
    public List<InscripcionTarjeta> obtener() {
        ResultSet rs;

        String sql="SELECT id_inscripciontarjeta, Cliente_id_cliente, Actividad_id_actividad, metodopagotarjeta_idmetodopagotarjeta FROM inscripciontarjeta";

        List<InscripcionTarjeta> listaInscripcionTarjetas = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    InscripcionTarjeta i=new InscripcionTarjeta();
                    i.setIdInscripcion(rs.getInt(1));
                    i.setCliente_id_cliente(rs.getInt(2));
                    i.setActividad_id_actividad(rs.getInt(3));
                    i.setMetodopagotarjeta_idmetodopagotarjeta(rs.getInt(4));
                    listaInscripcionTarjetas.add(i);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase InscripcionTarjetaDAOImple, método obtener");
        }
        return listaInscripcionTarjetas;

    }

    @Override
    public boolean guardar(InscripcionTarjeta inscripcionTarjeta) {
        String sql="INSERT INTO `inscripciontarjeta` (`Cliente_id_cliente`, `Actividad_id_actividad`, `metodopagotarjeta_idmetodopagotarjeta`) VALUES (" + inscripcionTarjeta.getCliente_id_cliente()+ "," + inscripcionTarjeta.getActividad_id_actividad()+ "," + inscripcionTarjeta.getMetodopagotarjeta_idmetodopagotarjeta()+ ")";
        boolean guardado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                guardado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase InscripcionTarjetaDAOImple, método guardar");
        }
        return guardado;
    }

}
