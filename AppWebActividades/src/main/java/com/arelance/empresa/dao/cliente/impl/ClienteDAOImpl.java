/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.cliente.impl;


import com.arelance.empresa.dao.cliente.IClienteDao;
import com.arelance.empresa.imd.beans.Cliente;
import com.arelance.empresa.imd.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Manuel
 */
public class ClienteDAOImpl implements IClienteDao{
    
    @Override
    public List<Cliente> obtener() {
        ResultSet rs;

        String sql="SELECT id_actividad, nombre, descripción, entrenador, precio, dia_semana, hora_inicio, hora_fin FROM actividad";

        List<Cliente> listaCliente = new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Cliente c=new Cliente();
                    c.setIdCliente(rs.getInt(1));
                    c.setNombre(rs.getString(2));
                    c.setApellido(rs.getString(3));
                    c.setTelefono(rs.getString(4));
                    c.setEmail(rs.getString(5));
                    c.setNick(rs.getString(6));
                    c.setPassword(rs.getString(7));
                    listaCliente.add(c);
                }
                rs.close();
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase ClienteDaoImple, método obtener");
        }
        return listaCliente;

    }

    @Override
    public boolean guardar(Cliente cliente) {                                                                                                                                                                                   
        String sql="INSERT INTO `cliente` (`nombre`, `apellido`, `Teléfono`, `email`, `nick`, `password`) VALUES (" + cliente.getNombre() + "," + cliente.getApellido() + "," + cliente.getTelefono() + "," + cliente.getEmail() + "," + cliente.getNick() +  "," + cliente.getPassword()+ ")";
        boolean guardado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                guardado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase ClienteDaoImple, método guardar");
        }
        return guardado;
    }

    @Override
    public boolean actualizar(Cliente cliente) {
        String sql="UPDATE `cliente` SET `nombre` = '" + cliente.getNombre() + "', `apellido` = '" + cliente.getApellido()+ "', `Teléfono` = '" + cliente.getTelefono()+ "', `email` = '" + cliente.getEmail()+ "', `nick` = '" + cliente.getNick()+ "', `password` = '" + cliente.getPassword()+ "' WHERE (`id_cliente` = '" + cliente.getIdCliente()+ "')";
        boolean actualizado = false;
        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
                actualizado = true;
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase ClienteDaoImple, método actualizar");
        } 
        return actualizado;
    }

}
