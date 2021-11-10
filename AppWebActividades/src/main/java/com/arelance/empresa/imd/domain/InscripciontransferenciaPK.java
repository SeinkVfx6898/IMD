/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author usuar
 */
@Embeddable
public class InscripciontransferenciaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_actividad")
    private int idActividad;

    public InscripciontransferenciaPK() {
    }

    public InscripciontransferenciaPK(int idCliente, int idActividad) {
        this.idCliente = idCliente;
        this.idActividad = idActividad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCliente;
        hash += (int) idActividad;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InscripciontransferenciaPK)) {
            return false;
        }
        InscripciontransferenciaPK other = (InscripciontransferenciaPK) object;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idActividad != other.idActividad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.InscripciontransferenciaPK[ idCliente=" + idCliente + ", idActividad=" + idActividad + " ]";
    }
    
}