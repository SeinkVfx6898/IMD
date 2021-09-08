/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.modelo;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class LoginAction implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response){
    try {
      Navigation.login(request, response);
    } catch (IOException ex) {
        ex.getMessage();
    }
    }

   
    
}
