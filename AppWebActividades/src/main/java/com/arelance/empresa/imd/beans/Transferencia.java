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
    private int Cliente_id_cliente;

    public Transferencia(int idTransferencia, int iban, String conceptoPago, int Cliente_id_cliente) {
        this.idTransferencia = idTransferencia;
        this.iban = iban;
        this.conceptoPago = conceptoPago;
        this.Cliente_id_cliente = Cliente_id_cliente;
    }

    public Transferencia(int iban, String conceptoPago, int Cliente_id_cliente) {
        this.iban = iban;
        this.conceptoPago = conceptoPago;
        this.Cliente_id_cliente = Cliente_id_cliente;
    }

    public Transferencia() {
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

    public int getCliente_id_cliente() {
        return Cliente_id_cliente;
    }

    public void setCliente_id_cliente(int Cliente_id_cliente) {
        this.Cliente_id_cliente = Cliente_id_cliente;
    }
    
    
}
