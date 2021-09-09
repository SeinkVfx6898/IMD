/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.cliente;

import com.arelance.empresa.imd.beans.Cliente;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface ClienteDAO {
    
    public List<Cliente> obtener();
    public boolean guardar(Cliente cliente);
    public boolean actualizar(Cliente cliente);
    
}
