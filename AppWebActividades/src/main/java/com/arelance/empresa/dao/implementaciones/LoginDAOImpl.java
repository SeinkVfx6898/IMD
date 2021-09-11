/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.implementaciones;

import com.arelance.empresa.dao.interfaces.LoginDAO;
import com.arelance.empresa.imd.beans.Cliente;
import com.arelance.empresa.imd.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lenovo
 */
public class LoginDAOImpl implements LoginDAO<Cliente> {

    private static final String VERIFICAR = "SELECT*FROM cliente WHERE nick=? AND password=?";
    private static final String REGISTRAR = "INSERT IGNORE INTO cliente(nombre,apellido,Teléfono,email,nick,password) VALUES(?,?,?,?,?,?)";

    @Override
    public List<Cliente> Verificar(Cliente cliente) {
           List<Cliente> listaClientes = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            //Establecemos conexion con la base de datos tiendagame_bd.
            conn = Conexion.conectar();
            stmt = conn.prepareStatement(VERIFICAR);
            //Recogemos los parametros del objeto e indicamos su orden.
            stmt.setString(1, cliente.getNick());
            stmt.setString(2, cliente.getPassword());
            rs = stmt.executeQuery();//ejecutamos la sentencia sql.
            while (rs.next()) {
                cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                listaClientes.add(cliente);
            }

        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();//Liberamos statement.
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();//Liberamos resultset.
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();//Liberamos conexion.
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }
        return listaClientes;
    }

    @Override
    public Boolean Registrar(Cliente cliente) {
         Connection conn = null;
        PreparedStatement stmt = null;
        Boolean bandera = null;
        try {
            //Establecemos conexion con la base de datos tiendagame_bd.
            conn = Conexion.conectar();
            //Escribimos la sentencia sql que queremos ejecutar...
            stmt = conn.prepareStatement(REGISTRAR);
            //Recogemos los parametros del objeto e indicamos su orden.
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getTelefono());
            stmt.setString(4,cliente.getEmail());
            stmt.setString(5,cliente.getNick());
            stmt.setString(6,cliente.getPassword());
            stmt.executeUpdate();//ejecutamos la sentencia sql.
            bandera = true;
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();//Liberamos el statement.
                } catch (SQLException ex) {
                    ex.getMessage();
                }
            }
            if (conn != null) {
                try {
                    conn.close();//Liberamos conexión con BD.
                } catch (SQLException ex) {
                    ex.getMessage();
                }
            }
        }
        return bandera;
    }

}
