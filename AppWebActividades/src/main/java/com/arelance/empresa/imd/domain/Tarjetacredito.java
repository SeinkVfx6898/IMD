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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manuel
 * @author manuel
 */
@Entity
@Table(name = "tarjetacredito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjetacredito.findAll", query = "SELECT t FROM Tarjetacredito t"),
    @NamedQuery(name = "Tarjetacredito.findByIdTarjetaCredito", query = "SELECT t FROM Tarjetacredito t WHERE t.idTarjetaCredito = :idTarjetaCredito"),
    @NamedQuery(name = "Tarjetacredito.findByNumero", query = "SELECT t FROM Tarjetacredito t WHERE t.numero = :numero"),
    @NamedQuery(name = "Tarjetacredito.findByFechacaducidad", query = "SELECT t FROM Tarjetacredito t WHERE t.fechacaducidad = :fechacaducidad"),
    @NamedQuery(name = "Tarjetacredito.findByCvv", query = "SELECT t FROM Tarjetacredito t WHERE t.cvv = :cvv")})
public class Tarjetacredito implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "n\u00famero")
    private double numero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Fecha_caducidad")
    private String fechacaducidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVV")
    private int cvv;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarjeta_credito")
    private Integer idTarjetaCredito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTarjetaCredito")
    private Collection<Metodopagotarjeta> metodopagotarjetaCollection;

    public Tarjetacredito() {
    }

    public Tarjetacredito(Integer idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }

    public Tarjetacredito(double número, String fechacaducidad, int cvv) {
        this.numero = número;
        this.fechacaducidad = fechacaducidad;
        this.cvv = cvv;
    }
    

    public Tarjetacredito(Integer idTarjetaCredito, double número, String fechacaducidad, int cvv) {
        this.idTarjetaCredito = idTarjetaCredito;
        this.numero = número;
        this.fechacaducidad = fechacaducidad;
        this.cvv = cvv;
    }



    public Integer getIdTarjetaCredito() {
        return idTarjetaCredito;
    }

    public void setIdTarjetaCredito(Integer idTarjetaCredito) {
        this.idTarjetaCredito = idTarjetaCredito;
    }


    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }


    @XmlTransient
    public Collection<Metodopagotarjeta> getMetodopagotarjetaCollection() {
        return metodopagotarjetaCollection;
    }

    public void setMetodopagotarjetaCollection(Collection<Metodopagotarjeta> metodopagotarjetaCollection) {
        this.metodopagotarjetaCollection = metodopagotarjetaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarjetaCredito != null ? idTarjetaCredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetacredito)) {
            return false;
        }
        Tarjetacredito other = (Tarjetacredito) object;
        if ((this.idTarjetaCredito == null && other.idTarjetaCredito != null) || (this.idTarjetaCredito != null && !this.idTarjetaCredito.equals(other.idTarjetaCredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Tarjetacredito[ idTarjetaCredito=" + idTarjetaCredito + " ]";
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    
}
