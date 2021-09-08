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
public class Transferencia {

    private int idTransferencia;
    private int iban;
    private String conceptoPago;
    private int MetodoPago_id_MetodoPago;

    public Transferencia(int idTransferencia, int iban, String conceptoPago, int MetodoPago_id_MetodoPago) {
        this.idTransferencia = idTransferencia;
        this.iban = iban;
        this.conceptoPago = conceptoPago;
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }

    public Transferencia(int iban, String conceptoPago, int MetodoPago_id_MetodoPago) {
        this.iban = iban;
        this.conceptoPago = conceptoPago;
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }

    
    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public int getMetodoPago_id_MetodoPago() {
        return MetodoPago_id_MetodoPago;
    }

    public void setMetodoPago_id_MetodoPago(int MetodoPago_id_MetodoPago) {
        this.MetodoPago_id_MetodoPago = MetodoPago_id_MetodoPago;
    }
    
    
}
