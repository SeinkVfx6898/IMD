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
    private int Cliente_id_cliente;

    public TarjetaCredito(int idTarjetaCredito, int numero, String fechaCaducidad, int CVV, int Cliente_id_cliente) {
        this.idTarjetaCredito = idTarjetaCredito;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.CVV = CVV;
        this.Cliente_id_cliente = Cliente_id_cliente;
    }

    public TarjetaCredito(int numero, String fechaCaducidad, int CVV, int Cliente_id_cliente) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.CVV = CVV;
        this.Cliente_id_cliente = Cliente_id_cliente;
    }

    public TarjetaCredito() {
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

    public int getCliente_id_cliente() {
        return Cliente_id_cliente;
    }

    public void setCliente_id_cliente(int Cliente_id_cliente) {
        this.Cliente_id_cliente = Cliente_id_cliente;
    }
    
    
        
}
