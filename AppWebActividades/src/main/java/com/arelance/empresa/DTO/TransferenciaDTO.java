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
public class TransferenciaDTO {
    private int iban;

    public int getIban() {
        return iban;
    }

    public TransferenciaDTO() {
    }

    
    public TransferenciaDTO(int iban) {
        this.iban = iban;
    }
    
}