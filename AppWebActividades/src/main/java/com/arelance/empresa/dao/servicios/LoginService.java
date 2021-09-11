/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.servicios;

import java.util.List;

/**
 *
 * @author lenovo
 */

public interface LoginService<T> {
    public List<T> verificar(T t);
    public Boolean Registrar(T t);
}
