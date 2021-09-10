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
public class InscripcionTarjeta {
    private int idInscripcion;
    private int Cliente_id_cliente;
    private int Actividad_id_actividad;
    private int metodopagotarjeta_idmetodopagotarjeta;

    public InscripcionTarjeta(int idInscripcion, int Cliente_id_cliente, int Actividad_id_actividad, int metodopagotarjeta_idmetodopagotarjeta) {
        this.idInscripcion = idInscripcion;
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Actividad_id_actividad = Actividad_id_actividad;
        this.metodopagotarjeta_idmetodopagotarjeta = metodopagotarjeta_idmetodopagotarjeta;
    }

    public InscripcionTarjeta(int Cliente_id_cliente, int Actividad_id_actividad, int metodopagotarjeta_idmetodopagotarjeta) {
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Actividad_id_actividad = Actividad_id_actividad;
        this.metodopagotarjeta_idmetodopagotarjeta = metodopagotarjeta_idmetodopagotarjeta;
    }

    public InscripcionTarjeta() {
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

    public int getMetodopagotarjeta_idmetodopagotarjeta() {
        return metodopagotarjeta_idmetodopagotarjeta;
    }

    public void setMetodopagotarjeta_idmetodopagotarjeta(int metodopagotarjeta_idmetodopagotarjeta) {
        this.metodopagotarjeta_idmetodopagotarjeta = metodopagotarjeta_idmetodopagotarjeta;
    }
    
}
