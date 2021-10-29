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
@Table(name = "transferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transferencia.findAll", query = "SELECT t FROM Transferencia t"),
    @NamedQuery(name = "Transferencia.findByIdTransferencia", query = "SELECT t FROM Transferencia t WHERE t.idTransferencia = :idTransferencia"),
    @NamedQuery(name = "Transferencia.findByIban", query = "SELECT t FROM Transferencia t WHERE t.iban = :iban"),
    @NamedQuery(name = "Transferencia.findByConceptoPago", query = "SELECT t FROM Transferencia t WHERE t.conceptoPago = :conceptoPago")})
public class Transferencia implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "iban")
    private int iban;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "concepto_pago")
    private String conceptoPago;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_transferencia")
    private Integer idTransferencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTransferencia")
    private Collection<Metodopagotransferencia> metodopagotransferenciaCollection;

    public Transferencia() {
    }

    public Transferencia(Integer idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public Transferencia(int iban, String conceptoPago) {
        this.iban = iban;
        this.conceptoPago = conceptoPago;
    }
    
    public Transferencia(Integer idTransferencia, int iban, String conceptoPago) {
        this.idTransferencia = idTransferencia;
        this.iban = iban;
        this.conceptoPago = conceptoPago;
    }

    public Integer getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(Integer idTransferencia) {
        this.idTransferencia = idTransferencia;
    }


    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    @XmlTransient
    public Collection<Metodopagotransferencia> getMetodopagotransferenciaCollection() {
        return metodopagotransferenciaCollection;
    }

    public void setMetodopagotransferenciaCollection(Collection<Metodopagotransferencia> metodopagotransferenciaCollection) {
        this.metodopagotransferenciaCollection = metodopagotransferenciaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransferencia != null ? idTransferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transferencia)) {
            return false;
        }
        Transferencia other = (Transferencia) object;
        if ((this.idTransferencia == null && other.idTransferencia != null) || (this.idTransferencia != null && !this.idTransferencia.equals(other.idTransferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.empresa.imd.domain.Transferencia[ idTransferencia=" + idTransferencia + " ]";
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

}
