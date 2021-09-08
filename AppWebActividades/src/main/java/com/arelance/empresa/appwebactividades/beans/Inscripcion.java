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
public class Inscripcion {
    private int idInscripcion;
    private int Cliente_id_cliente;
    private int Actividad_id_actividad;

    public Inscripcion(int idInscripcion, int Cliente_id_cliente, int Actividad_id_actividad) {
        this.idInscripcion = idInscripcion;
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Actividad_id_actividad = Actividad_id_actividad;
    }
    
    public Inscripcion(int Cliente_id_cliente, int Actividad_id_actividad) {
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Actividad_id_actividad = Actividad_id_actividad;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getCliente_id_cliente() {
        return Cliente_id_cliente;
    }

    public void setCliente_id_cliente(int Cliente_id_cliente) {
        this.Cliente_id_cliente = Cliente_id_cliente;
    }

    public int getActividad_id_actividad() {
        return Actividad_id_actividad;
    }

    public void setActividad_id_actividad(int Actividad_id_actividad) {
        this.Actividad_id_actividad = Actividad_id_actividad;
    }
    
    
}
