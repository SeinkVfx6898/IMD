/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "inscripciontarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripciontarjeta.findAll", query = "SELECT i FROM Inscripciontarjeta i")})
public class Inscripciontarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inscripciontarjeta")
    private Integer idInscripciontarjeta;
    @JoinColumn(name = "id_actividad", referencedColumnName = "id_actividad")
    @ManyToOne(optional = false)
    private Actividad idActividad;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_tarjeta_credito", referencedColumnName = "id_tarjeta_credito")
    @ManyToOne(optional = false)
    private Tarjetacredito idTarjetaCredito;

    public Inscripciontarjeta() {
    }

    public Inscripciontarjeta(Integer idInscripciontarjeta) {
        this.idInscripciontarjeta = idInscripciontarjeta;
    }

    public Inscripciontarjeta(Actividad idActividad, Cliente idCliente, Tarjetacredito idTarjetaCredito) {
        this.idActividad = idActividad;
        this.idCliente = idCliente;
        this.idTarjetaCredito = idTarjetaCredito;
    }
    
    
    public Integer getIdInscripciontarjeta() {
        return idInscripciontarjeta;
    }

    public void setIdInscripciontarjeta(Integer idInscripciontarjeta) {
        this.idInscripciontarjeta = idInscripciontarjeta;
    }

    public Actividad getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Actividad idActividad) {
        this.idActividad = idActividad;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Tarjetacredito getIdTarjetaCredito() {
        return idTarjetaCredito;
    }

    public void setIdTarjetaCredito(Tarjetacredito idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscripciontarjeta != null ? idInscripciontarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripciontarjeta)) {
            return false;
        }
        Inscripciontarjeta other = (Inscripciontarjeta) object;
        if ((this.idInscripciontarjeta == null && other.idInscripciontarjeta != null) || (this.idInscripciontarjeta != null && !this.idInscripciontarjeta.equals(other.idInscripciontarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Inscripciontarjeta[ idInscripciontarjeta=" + idInscripciontarjeta + " ]";
    }
    
}
