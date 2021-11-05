/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manuel
 * @author manuel
 */
@Entity
@Table(name = "metodopagotransferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metodopagotransferencia.findAll", query = "SELECT m FROM Metodopagotransferencia m"),
    @NamedQuery(name = "Metodopagotransferencia.findByIdmetodopagotransferencia", query = "SELECT m FROM Metodopagotransferencia m WHERE m.idmetodopagotransferencia = :idmetodopagotransferencia")})
public class Metodopagotransferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmetodopagotransferencia")
    private Integer idmetodopagotransferencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "metodopagotransferenciaIdmetodopagotransferencia")
    private Collection<Inscripciontransferencia> inscripciontransferenciaCollection;
    @JoinColumn(name = "id_transferencia", referencedColumnName = "id_transferencia")
    @ManyToOne(optional = false)
    private Transferencia idTransferencia;

    public Metodopagotransferencia() {
    }

    public Metodopagotransferencia(Integer idmetodopagotransferencia) {
        this.idmetodopagotransferencia = idmetodopagotransferencia;
    }

    public Metodopagotransferencia(Transferencia idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    
    public Integer getIdmetodopagotransferencia() {
        return idmetodopagotransferencia;
    }

    public void setIdmetodopagotransferencia(Integer idmetodopagotransferencia) {
        this.idmetodopagotransferencia = idmetodopagotransferencia;
    }

    @XmlTransient
    public Collection<Inscripciontransferencia> getInscripciontransferenciaCollection() {
        return inscripciontransferenciaCollection;
    }

    public void setInscripciontransferenciaCollection(Collection<Inscripciontransferencia> inscripciontransferenciaCollection) {
        this.inscripciontransferenciaCollection = inscripciontransferenciaCollection;
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
        hash += (idmetodopagotransferencia != null ? idmetodopagotransferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Metodopagotransferencia)) {
            return false;
        }
        Metodopagotransferencia other = (Metodopagotransferencia) object;
        if ((this.idmetodopagotransferencia == null && other.idmetodopagotransferencia != null) || (this.idmetodopagotransferencia != null && !this.idmetodopagotransferencia.equals(other.idmetodopagotransferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Metodopagotransferencia[ idmetodopagotransferencia=" + idmetodopagotransferencia + " ]";
    }

}
