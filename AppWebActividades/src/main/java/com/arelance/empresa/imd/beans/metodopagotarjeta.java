/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.beans;

/**
 *
 * @author Manuel
 */
public class metodopagotarjeta {

    private int idmetodopagotarjeta;
    private int TarjetaCredito_id_tarjeta_credito;

    public metodopagotarjeta(int idmetodopagotarjeta, int TarjetaCredito_id_tarjeta_credito) {
        this.idmetodopagotarjeta = idmetodopagotarjeta;
        this.TarjetaCredito_id_tarjeta_credito = TarjetaCredito_id_tarjeta_credito;
    }

    public metodopagotarjeta() {
    }

    

    public int getIdMetodoPago() {
        return idmetodopagotarjeta;
    }

    public void setIdMetodoPago(int idmetodopagotarjeta) {
        this.idmetodopagotarjeta = idmetodopagotarjeta;
    }

    public int getTarjetaCredito_id_tarjeta_credito() {
        return TarjetaCredito_id_tarjeta_credito;
    }

    public void setTarjetaCredito_id_tarjeta_credito(int TarjetaCredito_id_tarjeta_credito) {
        this.TarjetaCredito_id_tarjeta_credito = TarjetaCredito_id_tarjeta_credito;
    }   
    
}
