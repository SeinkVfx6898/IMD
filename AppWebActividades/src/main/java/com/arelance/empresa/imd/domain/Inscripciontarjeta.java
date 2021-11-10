/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lenovo
 */
@Entity
@Table(name = "inscripciontarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripciontarjeta.findAll", query = "SELECT i FROM Inscripciontarjeta i"),
    @NamedQuery(name = "Inscripciontarjeta.findByIdCliente", query = "SELECT i FROM Inscripciontarjeta i WHERE i.inscripciontarjetaPK.idCliente = :idCliente"),
    @NamedQuery(name = "Inscripciontarjeta.findByIdActividad", query = "SELECT i FROM Inscripciontarjeta i WHERE i.inscripciontarjetaPK.idActividad = :idActividad")})
public class Inscripciontarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InscripciontarjetaPK inscripciontarjetaPK;
    @JoinColumn(name = "id_actividad", referencedColumnName = "id_actividad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "id_metodopagotarjeta", referencedColumnName = "idmetodopagotarjeta")
    @ManyToOne(optional = false)
    private Metodopagotarjeta idMetodopagotarjeta;

    public Inscripciontarjeta() {
    }

    public Inscripciontarjeta(InscripciontarjetaPK inscripciontarjetaPK) {
        this.inscripciontarjetaPK = inscripciontarjetaPK;
    }

    public Inscripciontarjeta(int idCliente, int idActividad) {
        this.inscripciontarjetaPK = new InscripciontarjetaPK(idCliente, idActividad);
    }

    public Inscripciontarjeta(int idCliente, int idActividad, Metodopagotarjeta idMetodopagotarjeta) {
        this.inscripciontarjetaPK = new InscripciontarjetaPK(idCliente, idActividad);
        this.idMetodopagotarjeta = idMetodopagotarjeta;
    }

    public Inscripciontarjeta(Actividad actividad, Cliente cliente, Metodopagotarjeta idMetodopagotarjeta) {
        this.actividad = actividad;
        this.cliente = cliente;
        this.idMetodopagotarjeta = idMetodopagotarjeta;
    }

    public Inscripciontarjeta(InscripciontarjetaPK inscripciontarjetaPK, Metodopagotarjeta idMetodopagotarjeta) {
        this.inscripciontarjetaPK = inscripciontarjetaPK;
        this.idMetodopagotarjeta = idMetodopagotarjeta;
    }

    public Inscripciontarjeta(InscripciontarjetaPK inscripciontarjetaPK, Actividad actividad, Cliente cliente, Metodopagotarjeta idMetodopagotarjeta) {
        this.inscripciontarjetaPK = inscripciontarjetaPK;
        this.actividad = actividad;
        this.cliente = cliente;
        this.idMetodopagotarjeta = idMetodopagotarjeta;
    }

    
    
    public InscripciontarjetaPK getInscripciontarjetaPK() {
        return inscripciontarjetaPK;
    }

    public void setInscripciontarjetaPK(InscripciontarjetaPK inscripciontarjetaPK) {
        this.inscripciontarjetaPK = inscripciontarjetaPK;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Metodopagotarjeta getIdMetodopagotarjeta() {
        return idMetodopagotarjeta;
    }

    public void setIdMetodopagotarjeta(Metodopagotarjeta idMetodopagotarjeta) {
        this.idMetodopagotarjeta = idMetodopagotarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inscripciontarjetaPK != null ? inscripciontarjetaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripciontarjeta)) {
            return false;
        }
        Inscripciontarjeta other = (Inscripciontarjeta) object;
        if ((this.inscripciontarjetaPK == null && other.inscripciontarjetaPK != null) || (this.inscripciontarjetaPK != null && !this.inscripciontarjetaPK.equals(other.inscripciontarjetaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Inscripciontarjeta[ inscripciontarjetaPK=" + inscripciontarjetaPK + " ]";
    }

}
