/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.metodopagotransferencia.impl;


import com.arelance.empresa.dao.metodopagotransferencia.IMetodoPagoTransferenciaDAO;
import com.arelance.empresa.imd.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.arelance.empresa.imd.beans.*;


/**
 *
 * @author Manuel
 */
public class MetodoPagoTransferenciaDAOImpl implements IMetodoPagoTransferenciaDAO{
    
    @Override
    public List<MetodoPagoTransferencia> obtener() {
        ResultSet rs;

        String sql="SELECT idmetodopagotransferencia, Transferencia_id_transferencia FROM metodopagotransferencia";

        List<MetodoPagoTransferencia> metodoPagoTransferencias = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    MetodoPagoTransferencia m=new MetodoPagoTransferencia();
                    m.setIdmetodopagotransferencia(rs.getInt(1));
                    m.setTransferencia_id_transferencia(rs.getInt(2));
                    metodoPagoTransferencias.add(m);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase MetodoPagoTransferenciaDAOImple, método obtener");
        }
        return metodoPagoTransferencias;

    }

    @Override
    public boolean guardar(MetodoPagoTransferencia metodoPagoTransferencia) {
        String sql="INSERT INTO `metodopagotransferencia` (`Transferencia_id_transferencia`)  VALUES (" + metodoPagoTransferencia.getTransferencia_id_transferencia() + ")";
        boolean guardado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                guardado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase MetodoPagoTransferenciaDAOImple, método guardar");
        }
        return guardado;
    }

}
