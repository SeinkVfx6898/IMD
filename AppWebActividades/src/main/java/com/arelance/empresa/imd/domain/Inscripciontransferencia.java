<<<<<<< HEAD
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
@Table(name = "inscripciontransferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripciontransferencia.findAll", query = "SELECT i FROM Inscripciontransferencia i"),
    @NamedQuery(name = "Inscripciontransferencia.findByIdInscripciontransferencia", query = "SELECT i FROM Inscripciontransferencia i WHERE i.idInscripciontransferencia = :idInscripciontransferencia")})
public class Inscripciontransferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inscripciontransferencia")
    private Integer idInscripciontransferencia;
    @JoinColumn(name = "id_actividad", referencedColumnName = "id_actividad")
    @ManyToOne(optional = false)
    private Actividad actividadidactividad;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente clienteidcliente;
    @JoinColumn(name = "id_metodopagotransferencia", referencedColumnName = "idmetodopagotransferencia")
    @ManyToOne(optional = false)
    private Metodopagotransferencia metodopagotransferenciaIdmetodopagotransferencia;

    public Inscripciontransferencia() {
    }

    public Inscripciontransferencia(Integer idInscripciontransferencia) {
        this.idInscripciontransferencia = idInscripciontransferencia;
    }

    public Inscripciontransferencia(Actividad actividadidactividad, Cliente clienteidcliente, Metodopagotransferencia metodopagotransferenciaIdmetodopagotransferencia) {
        this.actividadidactividad = actividadidactividad;
        this.clienteidcliente = clienteidcliente;
        this.metodopagotransferenciaIdmetodopagotransferencia = metodopagotransferenciaIdmetodopagotransferencia;
    }

    
    public Integer getIdInscripciontransferencia() {
        return idInscripciontransferencia;
    }

    public void setIdInscripciontransferencia(Integer idInscripciontransferencia) {
        this.idInscripciontransferencia = idInscripciontransferencia;
    }

    public Actividad getActividadidactividad() {
        return actividadidactividad;
    }

    public void setActividadidactividad(Actividad actividadidactividad) {
        this.actividadidactividad = actividadidactividad;
    }

    public Cliente getClienteidcliente() {
        return clienteidcliente;
    }

    public void setClienteidcliente(Cliente clienteidcliente) {
        this.clienteidcliente = clienteidcliente;
    }

    public Metodopagotransferencia getMetodopagotransferenciaIdmetodopagotransferencia() {
        return metodopagotransferenciaIdmetodopagotransferencia;
    }

    public void setMetodopagotransferenciaIdmetodopagotransferencia(Metodopagotransferencia metodopagotransferenciaIdmetodopagotransferencia) {
        this.metodopagotransferenciaIdmetodopagotransferencia = metodopagotransferenciaIdmetodopagotransferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscripciontransferencia != null ? idInscripciontransferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripciontransferencia)) {
            return false;
        }
        Inscripciontransferencia other = (Inscripciontransferencia) object;
        if ((this.idInscripciontransferencia == null && other.idInscripciontransferencia != null) || (this.idInscripciontransferencia != null && !this.idInscripciontransferencia.equals(other.idInscripciontransferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Inscripciontransferencia[ idInscripciontransferencia=" + idInscripciontransferencia + " ]";
    }
    
}
=======
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
@Table(name = "inscripciontransferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripciontransferencia.findAll", query = "SELECT i FROM Inscripciontransferencia i"),
    @NamedQuery(name = "Inscripciontransferencia.findByIdInscripciontransferencia", query = "SELECT i FROM Inscripciontransferencia i WHERE i.idInscripciontransferencia = :idInscripciontransferencia")})
public class Inscripciontransferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inscripciontransferencia")
    private Integer idInscripciontransferencia;
    @JoinColumn(name = "id_actividad", referencedColumnName = "id_actividad")
    @ManyToOne(optional = false)
    private Actividad actividadidactividad;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente clienteidcliente;
    @JoinColumn(name = "id_metodopagotransferencia", referencedColumnName = "idmetodopagotransferencia")
    @ManyToOne(optional = false)
    private Metodopagotransferencia metodopagotransferenciaIdmetodopagotransferencia;

    public Inscripciontransferencia() {
    }

    public Inscripciontransferencia(Integer idInscripciontransferencia) {
        this.idInscripciontransferencia = idInscripciontransferencia;
    }

    public Inscripciontransferencia(Actividad actividadidactividad, Cliente clienteidcliente, Metodopagotransferencia metodopagotransferenciaIdmetodopagotransferencia) {
        this.actividadidactividad = actividadidactividad;
        this.clienteidcliente = clienteidcliente;
        this.metodopagotransferenciaIdmetodopagotransferencia = metodopagotransferenciaIdmetodopagotransferencia;
    }

    
    public Integer getIdInscripciontransferencia() {
        return idInscripciontransferencia;
    }

    public void setIdInscripciontransferencia(Integer idInscripciontransferencia) {
        this.idInscripciontransferencia = idInscripciontransferencia;
    }

    public Actividad getActividadidactividad() {
        return actividadidactividad;
    }

    public void setActividadidactividad(Actividad actividadidactividad) {
        this.actividadidactividad = actividadidactividad;
    }

    public Cliente getClienteidcliente() {
        return clienteidcliente;
    }

    public void setClienteidcliente(Cliente clienteidcliente) {
        this.clienteidcliente = clienteidcliente;
    }

    public Metodopagotransferencia getMetodopagotransferenciaIdmetodopagotransferencia() {
        return metodopagotransferenciaIdmetodopagotransferencia;
    }

    public void setMetodopagotransferenciaIdmetodopagotransferencia(Metodopagotransferencia metodopagotransferenciaIdmetodopagotransferencia) {
        this.metodopagotransferenciaIdmetodopagotransferencia = metodopagotransferenciaIdmetodopagotransferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscripciontransferencia != null ? idInscripciontransferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripciontransferencia)) {
            return false;
        }
        Inscripciontransferencia other = (Inscripciontransferencia) object;
        if ((this.idInscripciontransferencia == null && other.idInscripciontransferencia != null) || (this.idInscripciontransferencia != null && !this.idInscripciontransferencia.equals(other.idInscripciontransferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Inscripciontransferencia[ idInscripciontransferencia=" + idInscripciontransferencia + " ]";
    }
    
}

>>>>>>> c1192c1a628b1b6b00d5ac9ec7fcb9446935a382
