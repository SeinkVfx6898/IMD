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
import com.arelance.empresa.dao.interfaces.IInscripcionTransferenciaDAO;
import com.arelance.empresa.imd.beans.InscripcionTransferencia;


/**
 *
 * @author Manuel
 */
public class InscripcionTransferenciaDAOImpl implements IInscripcionTransferenciaDAO{
    
    @Override
    public List<InscripcionTransferencia> obtener() {
        ResultSet rs;

        String sql="SELECT id_inscripciontransferencia, Cliente_id_cliente, Actividad_id_actividad, metodopagotransferencia_idmetodopagotransferencia FROM inscripciontransferencia";

        List<InscripcionTransferencia> listaInscripcionTransferencias = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    InscripcionTransferencia i=new InscripcionTransferencia();
                    i.setIdInscripcion(rs.getInt(1));
                    i.setCliente_id_cliente(rs.getInt(2));
                    i.setActividad_id_actividad(rs.getInt(3));
                    i.setMetodopagotransferencia_idmetodopagotransferencia(rs.getInt(4));
                    listaInscripcionTransferencias.add(i);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase InscripcionTransferenciaDAOImple, método obtener");
        }
        return listaInscripcionTransferencias;

    }

    @Override
    public boolean guardar(InscripcionTransferencia inscripcionTransferencia) {
        String sql="INSERT INTO `inscripciontransferencia` (`Cliente_id_cliente`, `Actividad_id_actividad`, `metodopagotransferencia_idmetodopagotransferencia`) VALUES  (" + inscripcionTransferencia.getCliente_id_cliente()+ "," + inscripcionTransferencia.getActividad_id_actividad()+ "," + inscripcionTransferencia.getMetodopagotransferencia_idmetodopagotransferencia()+ ")";
        boolean guardado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                guardado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase InscripcionTransferenciaDAOImple, método guardar");
        }
        return guardado;
    }

}
