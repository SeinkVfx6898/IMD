/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author lenovo
 */
@Entity
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a"),
    @NamedQuery(name = "Actividad.findByIdActividad", query = "SELECT a FROM Actividad a WHERE a.idActividad = :idActividad"),})
public class Actividad implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 500)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "entrenador")
    private String entrenador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 44)
    @Column(name = "dia_semana")
    private String diaSemana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "hora_inicio")
    private String horaInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "hora_fin")
    private String horaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<Inscripciontransferencia> inscripciontransferenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<Inscripciontarjeta> inscripciontarjetaCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad")
    private Integer idActividad;

    public Actividad() {
    }

    public Actividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Actividad(Integer idActividad, String nombre, String descripcion, String entrenador, BigDecimal precio, String diaSemana, String horaInicio, String horaFin) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.entrenador = entrenador;
        this.precio = precio;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }


    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actividad{" + "idActividad=" + idActividad + ", nombre=" + nombre + ", descripcion=" + descripcion + ", entrenador=" + entrenador + ", precio=" + precio + ", diaSemana=" + diaSemana + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }



    @XmlTransient
    public Collection<Inscripciontransferencia> getInscripciontransferenciaCollection() {
        return inscripciontransferenciaCollection;
    }

    public void setInscripciontransferenciaCollection(Collection<Inscripciontransferencia> inscripciontransferenciaCollection) {
        this.inscripciontransferenciaCollection = inscripciontransferenciaCollection;
    }

    @XmlTransient
    public Collection<Inscripciontarjeta> getInscripciontarjetaCollection() {
        return inscripciontarjetaCollection;
    }

    public void setInscripciontarjetaCollection(Collection<Inscripciontarjeta> inscripciontarjetaCollection) {
        this.inscripciontarjetaCollection = inscripciontarjetaCollection;
    }



}
