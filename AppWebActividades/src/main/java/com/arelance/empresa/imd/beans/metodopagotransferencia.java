/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.beans;

/**
 *
 * @author Manuel
 */
public class metodopagotransferencia {

    private int idmetodopagotransferencia;
    private int Transferencia_id_transferencia;

    public metodopagotransferencia(int idmetodopagotransferencia, int Transferencia_id_transferencia) {
        this.idmetodopagotransferencia = idmetodopagotransferencia;
        this.Transferencia_id_transferencia = Transferencia_id_transferencia;
    }

    public metodopagotransferencia() {
    }

    

    public int getIdMetodoPago() {
        return idmetodopagotransferencia;
    }

    public void setIdMetodoPago(int idmetodopagotransferencia) {
        this.idmetodopagotransferencia = idmetodopagotransferencia;
    }

    public int getTransferencia_id_transferencia() {
        return Transferencia_id_transferencia;
    }

    public void setTransferencia_id_transferencia(int Transferencia_id_transferencia) {
        this.Transferencia_id_transferencia = Transferencia_id_transferencia;
    }   
    
}
