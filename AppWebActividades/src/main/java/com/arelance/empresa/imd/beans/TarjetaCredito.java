/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "tarjetacredito")
public class TarjetaCredito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarjeta_credito")
    private int idTarjetaCredito;
    private int numero;
    private String fechaCaducidad;
    private int CVV;

    public TarjetaCredito(int idTarjetaCredito, int numero, String fechaCaducidad, int CVV) {
        this.idTarjetaCredito = idTarjetaCredito;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.CVV = CVV;
    }

    public TarjetaCredito(int numero, String fechaCaducidad, int CVV) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.CVV = CVV;
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

}
