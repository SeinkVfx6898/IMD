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
 * @author usuar
 * @author manuel
 */
@Entity
@Table(name = "inscripciontarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripciontarjeta.findAll", query = "SELECT i FROM Inscripciontarjeta i"),
    @NamedQuery(name = "Inscripciontarjeta.findByIdInscripciontarjeta", query = "SELECT i FROM Inscripciontarjeta i WHERE i.idInscripciontarjeta = :idInscripciontarjeta")})
public class Inscripciontarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inscripciontarjeta")
    private Integer idInscripciontarjeta;
    @JoinColumn(name = "Actividad_id_actividad", referencedColumnName = "id_actividad")
    @ManyToOne(optional = false)
    private Actividad Actividadidactividad;
    @JoinColumn(name = "Cliente_id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente clienteidcliente;
    @JoinColumn(name = "metodopagotarjeta_idmetodopagotarjeta", referencedColumnName = "id_metodopagotarjeta")
    @ManyToOne(optional = false)
    private Metodopagotarjeta metodopagotarjetaIdmetodopagotarjeta;

    public Inscripciontarjeta() {
    }

    public Inscripciontarjeta(Integer idInscripciontarjeta) {
        this.idInscripciontarjeta = idInscripciontarjeta;
    }

    public Inscripciontarjeta(Actividad actividadidactividad, Cliente clienteidcliente, Metodopagotarjeta metodopagotarjetaIdmetodopagotarjeta) {
        this.Actividadidactividad = actividadidactividad;
        this.clienteidcliente = clienteidcliente;
        this.metodopagotarjetaIdmetodopagotarjeta = metodopagotarjetaIdmetodopagotarjeta;
    }

    public Inscripciontarjeta(Actividad actividad, Cliente cliente2, Metodopagotarjeta pagotarjeta, Metodopagotarjeta pagotarjeta0) {
        this.Actividadidactividad = actividad;
        this.clienteidcliente = cliente2;
        this.metodopagotarjetaIdmetodopagotarjeta = pagotarjeta;
        this.metodopagotarjetaIdmetodopagotarjeta = pagotarjeta0;
    }

    public Integer getIdInscripciontarjeta() {
        return idInscripciontarjeta;
    }

    public void setIdInscripciontarjeta(Integer idInscripciontarjeta) {
        this.idInscripciontarjeta = idInscripciontarjeta;
    }

    public Actividad getActividadidactividad() {
        return Actividadidactividad;
    }

    public void setActividadidactividad(Actividad Actividadidactividad) {
        this.Actividadidactividad = Actividadidactividad;
    }

    public Cliente getClienteidcliente() {
        return clienteidcliente;
    }

    public void setClienteidcliente(Cliente clienteidcliente) {
        this.clienteidcliente = clienteidcliente;
    }

    public Metodopagotarjeta getMetodopagotarjetaIdmetodopagotarjeta() {
        return metodopagotarjetaIdmetodopagotarjeta;
    }

    public void setMetodopagotarjetaIdmetodopagotarjeta(Metodopagotarjeta metodopagotarjetaIdmetodopagotarjeta) {
        this.metodopagotarjetaIdmetodopagotarjeta = metodopagotarjetaIdmetodopagotarjeta;
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
