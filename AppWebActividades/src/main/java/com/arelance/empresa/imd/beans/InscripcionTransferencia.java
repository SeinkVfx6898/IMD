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
@Table(name = "inscripciontransferencia")
public class InscripcionTransferencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripciontransferencia")
    private int idInscripcionTransferencia;
    private int Cliente_id_cliente;
    private int Actividad_id_actividad;
    private int metodopagotransferencia_idmetodopagotransferencia;

    public InscripcionTransferencia(int idInscripcionTransferencia, int Cliente_id_cliente, int Actividad_id_actividad, int metodopagotransferencia_idmetodopagotransferencia) {
        this.idInscripcionTransferencia = idInscripcionTransferencia;
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Actividad_id_actividad = Actividad_id_actividad;
        this.metodopagotransferencia_idmetodopagotransferencia = metodopagotransferencia_idmetodopagotransferencia;
    }

    public InscripcionTransferencia(int Cliente_id_cliente, int Actividad_id_actividad, int metodopagotransferencia_idmetodopagotransferencia) {
        this.Cliente_id_cliente = Cliente_id_cliente;
        this.Actividad_id_actividad = Actividad_id_actividad;
        this.metodopagotransferencia_idmetodopagotransferencia = metodopagotransferencia_idmetodopagotransferencia;
    }

    public InscripcionTransferencia() {
    }

    public int getIdInscripcionTransferencia() {
        return idInscripcionTransferencia;
    }

    public void setIdInscripcionTransferencia(int idInscripcionTransferencia) {
        this.idInscripcionTransferencia = idInscripcionTransferencia;
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

    public int getMetodopagotransferencia_idmetodopagotransferencia() {
        return metodopagotransferencia_idmetodopagotransferencia;
    }

    public void setMetodopagotransferencia_idmetodopagotransferencia(int metodopagotransferencia_idmetodopagotransferencia) {
        this.metodopagotransferencia_idmetodopagotransferencia = metodopagotransferencia_idmetodopagotransferencia;
    }
    
    
}
