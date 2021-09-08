/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.appwebactividades.beans;

import com.arelance.empresa.appwebactividades.beans.enums.diasSemana;

/**
 *
 * @author Manuel
 */
public class Actividad {
    private int idActividad;
    private String nombre;
    private String descripcion;
    private String enternador;
    private double precio;
    private diasSemana[] diaSemana;
    private String horaInicio;
    private String horaFin;

    public Actividad(int idActividad, String nombre, String descripcion, String enternador, double precio, diasSemana[] diaSemana, String horaInicio, String horaFin) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enternador = enternador;
        this.precio = precio;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Actividad(String nombre, String descripcion, String enternador, double precio, diasSemana[] diaSemana, String horaInicio, String horaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enternador = enternador;
        this.precio = precio;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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

    public diasSemana[] getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(diasSemana[] diaSemana) {
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
