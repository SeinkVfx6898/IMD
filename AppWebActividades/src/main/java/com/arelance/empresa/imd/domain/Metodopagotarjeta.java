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
@Table(name = "metodopagotarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metodopagotarjeta.findAll", query = "SELECT m FROM Metodopagotarjeta m"),
    @NamedQuery(name = "Metodopagotarjeta.findById", query = "SELECT m FROM Metodopagotarjeta m WHERE m.idmetodopagotarjeta = :idmetodopagotarjeta")})
public class Metodopagotarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmetodopagotarjeta")
    private Integer idmetodopagotarjeta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMetodopagotarjeta")
    private Collection<Inscripciontarjeta> inscripciontarjetaCollection;
    @JoinColumn(name = "id_tarjeta_credito", referencedColumnName = "id_tarjeta_credito")
    @ManyToOne(optional = false)
    private Tarjetacredito idTarjetaCredito;

    public Metodopagotarjeta() {
    }

    public Metodopagotarjeta(Integer idmetodopagotarjeta) {
        this.idmetodopagotarjeta = idmetodopagotarjeta;
    }

    public Metodopagotarjeta(Tarjetacredito idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }
   
    public Integer getIdmetodopagotarjeta() {
        return idmetodopagotarjeta;
    }

    public void setIdmetodopagotarjeta(Integer idmetodopagotarjeta) {
        this.idmetodopagotarjeta = idmetodopagotarjeta;
    }

    @XmlTransient
    public Collection<Inscripciontarjeta> getInscripciontarjetaCollection() {
        return inscripciontarjetaCollection;
    }

    public void setInscripciontarjetaCollection(Collection<Inscripciontarjeta> inscripciontarjetaCollection) {
        this.inscripciontarjetaCollection = inscripciontarjetaCollection;
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
        hash += (idmetodopagotarjeta != null ? idmetodopagotarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Metodopagotarjeta)) {
            return false;
        }
        Metodopagotarjeta other = (Metodopagotarjeta) object;
        if ((this.idmetodopagotarjeta == null && other.idmetodopagotarjeta != null) || (this.idmetodopagotarjeta != null && !this.idmetodopagotarjeta.equals(other.idmetodopagotarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Metodopagotarjeta[ idmetodopagotarjeta=" + idmetodopagotarjeta + " ]";
    }
}
