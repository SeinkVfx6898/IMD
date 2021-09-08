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
public class TarjetaCredito {
    private int idTarjetaCredito;
    private int numero;
    private String fechaCaducidad;
    private int CVV;
    private int MetodoPago_id_MetodoPago;

    public TarjetaCredito(int idTarjetaCredito, int numero, String fechaCaducidad, int CVV, int MetodoPago_id_MetodoPago) {
        this.idTarjetaCredito = idTarjetaCredito;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.CVV = CVV;
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }

    public TarjetaCredito(int numero, String fechaCaducidad, int CVV, int MetodoPago_id_MetodoPago) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.CVV = CVV;
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }

    public int getIdTarjetaCredito() {
        return idTarjetaCredito;
    }

    public void setIdTarjetaCredito(int idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public int getMetodoPago_id_MetodoPago() {
        return MetodoPago_id_MetodoPago;
    }

    public void setMetodoPago_id_MetodoPago(int MetodoPago_id_MetodoPago) {
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }
    
    
        
}
