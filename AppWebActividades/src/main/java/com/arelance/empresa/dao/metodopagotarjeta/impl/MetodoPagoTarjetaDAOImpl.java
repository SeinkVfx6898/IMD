/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.metodopagotarjeta.impl;


import com.arelance.empresa.dao.metodopagotarjeta.IMetodoPagoTarjetaDAO;
import com.arelance.empresa.imd.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.arelance.empresa.imd.beans.MetodoPagoTarjeta;


/**
 *
 * @author Manuel
 */
public class MetodoPagoTarjetaDAOImpl implements IMetodoPagoTarjetaDAO{
    
    @Override
    public List<MetodoPagoTarjeta> obtener() {
        ResultSet rs;

        String sql="SELECT idmetodopagotarjeta, TarjetaCredito_id_tarjeta_credito FROM metodopagotarjeta";

        List<MetodoPagoTarjeta> listaMetodoPagoTarjetas = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    MetodoPagoTarjeta m=new MetodoPagoTarjeta();
                    m.setIdmetodopagotarjeta(rs.getInt(1));
                    m.setTarjetaCredito_id_tarjeta_credito(rs.getInt(2));
                    listaMetodoPagoTarjetas.add(m);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase MetodoPagoTarjetaDAOImple, método obtener");
        }
        return listaMetodoPagoTarjetas;

    }

    @Override
    public boolean guardar(MetodoPagoTarjeta metodoPagoTarjeta) {
        String sql="INSERT INTO `metodopagotarjeta` (`TarjetaCredito_id_tarjeta_credito`)  VALUES (" + metodoPagoTarjeta.getTarjetaCredito_id_tarjeta_credito() + ")";
        boolean guardado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                guardado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase MetodoPagoTarjetaDAOImple, método guardar");
        }
        return guardado;
    }

}
