/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.beans;

import java.io.Serializable;
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
@Table(name = "inscripciontarjeta")
public class InscripcionTarjeta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripciontarjeta")
    private int idInscripciontarjeta;
    private int Cliente_id_cliente;
    private int Actividad_id_actividad;
    private int metodopagotarjeta_idmetodopagotarjeta;

    public InscripcionTarjeta(int idInscripciontarjeta, int Cliente_id_cliente, int Actividad_id_actividad, int metodopagotarjeta_idmetodopagotarjeta) {
        this.idInscripciontarjeta = idInscripciontarjeta;
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

    public int getIdInscripciontarjeta() {
        return idInscripciontarjeta;
    }

    public void setIdInscripciontarjeta(int idInscripciontarjeta) {
        this.idInscripciontarjeta = idInscripciontarjeta;
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
