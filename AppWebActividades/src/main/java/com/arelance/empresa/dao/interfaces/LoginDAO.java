/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.dao.interfaces;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lenovo
 * @param <T>
 */
@Local
public interface LoginDAO<T> {

    public T Verificar(T t);

    public Boolean Registrar(T t);
}
