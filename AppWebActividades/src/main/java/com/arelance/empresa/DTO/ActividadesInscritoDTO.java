/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.DTO;

/**
 *
 * @author Manuel
 */
public class ActividadesInscritoDTO {
    private String nombre;

    public ActividadesInscritoDTO(String nombre) {
        this.nombre = nombre;
    }

    public ActividadesInscritoDTO() {
    }

    public String getNombre() {
        return nombre;
    }
    
}
