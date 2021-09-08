/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.appwebactividades.beans;

/**
 *
 * @author Manuel
 */
public class PayPal {
//    id_paypal, email, password, MetodoPago_id_MetodoPago
    private int idPaypal;
    private String email;
    private String password;
    private int MetodoPago_id_MetodoPago;

    public PayPal(int idPaypal, String email, String password, int MetodoPago_id_MetodoPago) {
        this.idPaypal = idPaypal;
        this.email = email;
        this.password = password;
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }

    public PayPal(String email, String password, int MetodoPago_id_MetodoPago) {
        this.email = email;
        this.password = password;
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }

    public int getIdPaypal() {
        return idPaypal;
    }

    public void setIdPaypal(int idPaypal) {
        this.idPaypal = idPaypal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMetodoPago_id_MetodoPago() {
        return MetodoPago_id_MetodoPago;
    }

    public void setMetodoPago_id_MetodoPago(int MetodoPago_id_MetodoPago) {
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }
    
    
    
    
}
