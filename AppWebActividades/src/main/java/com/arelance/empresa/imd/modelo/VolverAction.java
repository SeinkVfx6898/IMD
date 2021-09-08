/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.modelo;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class VolverAction implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
    try {
        Navigation.index(request, response);
    } catch (IOException ex) {
      ex.getMessage();
    }
    }
    
}
