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
public class MetodoPago {

    private int idMetodoPago;
    private int Cliente_id_cliente;
    private int Inscripcion_id_inscripcion;

    public MetodoPago(int idMetodoPago, int Cliente_id_cliente, int Inscripcion_id_inscripcion) {
        this.idMetodoPago = idMetodoPago;
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Inscripcion_id_inscripcion = Inscripcion_id_inscripcion;
    }

    public MetodoPago(int Cliente_id_cliente, int Inscripcion_id_inscripcion) {
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Inscripcion_id_inscripcion = Inscripcion_id_inscripcion;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public int getCliente_id_cliente() {
        return Cliente_id_cliente;
    }

    public void setCliente_id_cliente(int Cliente_id_cliente) {
        this.Cliente_id_cliente = Cliente_id_cliente;
    }

    public int getInscripcion_id_inscripcion() {
        return Inscripcion_id_inscripcion;
    }

    public void setInscripcion_id_inscripcion(int Inscripcion_id_inscripcion) {
        this.Inscripcion_id_inscripcion = Inscripcion_id_inscripcion;
    }
    
    
}
