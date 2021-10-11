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
@Table(name = "inscripciontransferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripciontransferencia.findAll", query = "SELECT i FROM Inscripciontransferencia i")})
public class Inscripciontransferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inscripciontransferencia")
    private Integer idInscripciontransferencia;
    @JoinColumn(name = "id_actividad", referencedColumnName = "id_actividad")
    @ManyToOne(optional = false)
    private Actividad idActividad;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_transferencia", referencedColumnName = "id_transferencia")
    @ManyToOne(optional = false)
    private Transferencia idTransferencia;

    public Inscripciontransferencia() {
    }

    public Inscripciontransferencia(Integer idInscripciontransferencia) {
        this.idInscripciontransferencia = idInscripciontransferencia;
    }

    public Inscripciontransferencia(Actividad idActividad, Cliente idCliente, Transferencia idTransferencia) {
        this.idActividad = idActividad;
        this.idCliente = idCliente;
        this.idTransferencia = idTransferencia;
    }

    
    public Integer getIdInscripciontransferencia() {
        return idInscripciontransferencia;
    }

    public void setIdInscripciontransferencia(Integer idInscripciontransferencia) {
        this.idInscripciontransferencia = idInscripciontransferencia;
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

    public Transferencia getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(Transferencia idTransferencia) {
        this.idTransferencia = idTransferencia;
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
