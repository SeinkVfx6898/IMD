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
import com.arelance.empresa.dao.interfaces.ITransferenciaDAO;
import com.arelance.empresa.imd.beans.Transferencia;


/**
 *
 * @author Manuel
 */
public class TransferenciaDAOImpl implements ITransferenciaDAO{
    
    @Override
    public List<Transferencia> obtener() {
        ResultSet rs;

        String sql="SELECT id_transferencia, iban, concepto_pago FROM transferencia";

        List<Transferencia> listaTransferencias = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Transferencia t=new Transferencia();
                    t.setIdTransferencia(rs.getInt(1));
                    t.setIban(rs.getInt(2));
                    t.setConceptoPago(rs.getString(3));
                    listaTransferencias.add(t);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase TransferenciaDaoImple, método obtener");
        }
        return listaTransferencias;

    }

    @Override
    public boolean guardar(Transferencia transferencia) {
        String sql="INSERT INTO `transferencia` (`iban`, `concepto_pago`) VALUES (" + transferencia.getIban()+ ",'" + transferencia.getConceptoPago()+ "')";
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
