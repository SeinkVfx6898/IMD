/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.modelo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class RegistroParte2Action implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            Navigation.registroParte2(request, response);
        } catch (IOException | ServletException ex) {
           ex.getMessage();
        }
    }
    
}
