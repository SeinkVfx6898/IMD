/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.modelo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuar
 */
public class RegistroAction implements Command {
    Navigation navigation=new Navigation();
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
    try {
        navigation.IndexToRegistro(request, response);
    } catch (IOException ex) {
        Logger.getLogger(RegistroAction.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
