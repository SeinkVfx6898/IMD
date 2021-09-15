/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "actividad")
public class Actividad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actividad")
    private int idActividad;
    private String nombre;
    private String descripcion;
    private String enternador;
    private double precio;
    private String diaSemana;
    private String horaInicio;
    private String horaFin;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inscripciontarjeta")
    private  List<InscripcionTarjeta> inscripcionTarjetas;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inscripciontransferencias")
    private  List<InscripcionTransferencia> inscripcionTransferencias;
    
    public Actividad(int idActividad, String nombre, String descripcion, String enternador, double precio, String diaSemana, String horaInicio, String horaFin) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enternador = enternador;
        this.precio = precio;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Actividad(String nombre, String descripcion, String enternador, double precio, String diaSemana, String horaInicio, String horaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enternador = enternador;
        this.precio = precio;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Actividad() { 
    }
    
    

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
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

    public String getEnternador() {
        return enternador;
    }

    public void setEnternador(String enternador) {
        this.enternador = enternador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
    
    
    
}
