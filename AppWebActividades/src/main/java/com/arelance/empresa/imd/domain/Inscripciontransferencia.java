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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuar
 */
@Entity
@Table(name = "inscripciontransferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripciontransferencia.findAll", query = "SELECT i FROM Inscripciontransferencia i"),
    @NamedQuery(name = "Inscripciontransferencia.findByIdCliente", query = "SELECT i FROM Inscripciontransferencia i WHERE i.inscripciontransferenciaPK.idCliente = :idCliente"),
    @NamedQuery(name = "Inscripciontransferencia.findByIdActividad", query = "SELECT i FROM Inscripciontransferencia i WHERE i.inscripciontransferenciaPK.idActividad = :idActividad")})
public class Inscripciontransferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InscripciontransferenciaPK inscripciontransferenciaPK;
    @JoinColumn(name = "id_actividad", referencedColumnName = "id_actividad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "id_metodopagotransferencia", referencedColumnName = "idmetodopagotransferencia")
    @ManyToOne(optional = false)
    private Metodopagotransferencia idMetodopagotransferencia;

    public Inscripciontransferencia() {
    }

    public Inscripciontransferencia(InscripciontransferenciaPK inscripciontransferenciaPK) {
        this.inscripciontransferenciaPK = inscripciontransferenciaPK;
    }

    public Inscripciontransferencia(int idCliente, int idActividad) {
        this.inscripciontransferenciaPK = new InscripciontransferenciaPK(idCliente, idActividad);
    }

    public InscripciontransferenciaPK getInscripciontransferenciaPK() {
        return inscripciontransferenciaPK;
    }

    public void setInscripciontransferenciaPK(InscripciontransferenciaPK inscripciontransferenciaPK) {
        this.inscripciontransferenciaPK = inscripciontransferenciaPK;
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

    public Metodopagotransferencia getIdMetodopagotransferencia() {
        return idMetodopagotransferencia;
    }

    public void setIdMetodopagotransferencia(Metodopagotransferencia idMetodopagotransferencia) {
        this.idMetodopagotransferencia = idMetodopagotransferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inscripciontransferenciaPK != null ? inscripciontransferenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripciontransferencia)) {
            return false;
        }
        Inscripciontransferencia other = (Inscripciontransferencia) object;
        if ((this.inscripciontransferenciaPK == null && other.inscripciontransferenciaPK != null) || (this.inscripciontransferenciaPK != null && !this.inscripciontransferenciaPK.equals(other.inscripciontransferenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Inscripciontransferencia[ inscripciontransferenciaPK=" + inscripciontransferenciaPK + " ]";
    }
    
}
