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
 */
@Entity
@Table(name = "metodopagotarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metodopagotarjeta.findAll", query = "SELECT m FROM Metodopagotarjeta m"),
    @NamedQuery(name = "Metodopagotarjeta.findByIdmetodopagotarjeta", query = "SELECT m FROM Metodopagotarjeta m WHERE m.idmetodopagotarjeta = :idmetodopagotarjeta")})
public class Metodopagotarjeta implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "metodopagotarjetaIdmetodopagotarjeta")
    private Collection<Inscripciontarjeta> inscripciontarjetaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmetodopagotarjeta")
    private Integer idmetodopagotarjeta;
    @JoinColumn(name = "id_tarjeta_credito", referencedColumnName = "id_tarjeta_credito")
    @ManyToOne(optional = false)
    private Tarjetacredito tarjetaCreditoidtarjetacredito;

    public Metodopagotarjeta() {
    }

    public Metodopagotarjeta(Integer idmetodopagotarjeta) {
        this.idmetodopagotarjeta = idmetodopagotarjeta;
    }

    public Integer getIdmetodopagotarjeta() {
        return idmetodopagotarjeta;
    }

    public void setIdmetodopagotarjeta(Integer idmetodopagotarjeta) {
        this.idmetodopagotarjeta = idmetodopagotarjeta;
    }

    public Tarjetacredito getTarjetaCreditoidtarjetacredito() {
        return tarjetaCreditoidtarjetacredito;
    }

    public void setTarjetaCreditoidtarjetacredito(Tarjetacredito tarjetaCreditoidtarjetacredito) {
        this.tarjetaCreditoidtarjetacredito = tarjetaCreditoidtarjetacredito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmetodopagotarjeta != null ? idmetodopagotarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Metodopagotarjeta)) {
            return false;
        }
        Metodopagotarjeta other = (Metodopagotarjeta) object;
        if ((this.idmetodopagotarjeta == null && other.idmetodopagotarjeta != null) || (this.idmetodopagotarjeta != null && !this.idmetodopagotarjeta.equals(other.idmetodopagotarjeta))) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Metodopagotarjeta[ idmetodopagotarjeta=" + idmetodopagotarjeta + " ]";
    }

    @XmlTransient
    public Collection<Inscripciontarjeta> getInscripciontarjetaCollection() {
        return inscripciontarjetaCollection;
    }

    public void setInscripciontarjetaCollection(Collection<Inscripciontarjeta> inscripciontarjetaCollection) {
        this.inscripciontarjetaCollection = inscripciontarjetaCollection;
    }
    
}
