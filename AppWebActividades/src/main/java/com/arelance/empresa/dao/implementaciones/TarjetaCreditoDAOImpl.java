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
import com.arelance.empresa.dao.interfaces.ITarjetaCreditoDAO;
import com.arelance.empresa.imd.beans.TarjetaCredito;


/**
 *
 * @author Manuel
 */
public class TarjetaCreditoDAOImpl implements ITarjetaCreditoDAO{
    
    @Override
    public List<TarjetaCredito> obtener() {
        ResultSet rs;

        String sql="SELECT id_tarjeta_credito, número, Fecha_caducidad, CVV FROM tarjetacredito";

        List<TarjetaCredito> listaTarjetaCreditos = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    TarjetaCredito t=new TarjetaCredito();
                    t.setIdTarjetaCredito(rs.getInt(1));
                    t.setNumero(rs.getInt(2));
                    t.setFechaCaducidad(rs.getString(3));
                    t.setCVV(rs.getInt(4));
                    listaTarjetaCreditos.add(t);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase TarjetaCreditoDaoImple, método obtener");
        }
        return listaTarjetaCreditos;

    }

    @Override
    public boolean guardar(TarjetaCredito tarjetaCredito) {
        String sql="INSERT INTO `tarjetacredito` (`número`, `Fecha_caducidad`, `CVV`) VALUES (" + tarjetaCredito.getNumero() + ",'" + tarjetaCredito.getFechaCaducidad() + "'," + tarjetaCredito.getCVV() + ")";
        boolean guardado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                guardado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase TarjetaCreditoDaoImple, método guardar");
        }
        return guardado;
    }

}
