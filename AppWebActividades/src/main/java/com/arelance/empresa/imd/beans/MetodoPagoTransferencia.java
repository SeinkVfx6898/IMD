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
public class MetodoPagoTransferencia {
    
    private int idmetodopagotransferencia;
    private int Transferencia_id_transferencia;

    public MetodoPagoTransferencia(int idmetodopagotransferencia, int Transferencia_id_transferencia) {
        this.idmetodopagotransferencia = idmetodopagotransferencia;
        this.Transferencia_id_transferencia = Transferencia_id_transferencia;
    }

    public MetodoPagoTransferencia(int Transferencia_id_transferencia) {
        this.Transferencia_id_transferencia = Transferencia_id_transferencia;
    }

    public MetodoPagoTransferencia() {
    }

    public int getIdmetodopagotransferencia() {
        return idmetodopagotransferencia;
    }

    public void setIdmetodopagotransferencia(int idmetodopagotransferencia) {
        this.idmetodopagotransferencia = idmetodopagotransferencia;
    }

    public int getTransferencia_id_transferencia() {
        return Transferencia_id_transferencia;
    }

    public void setTransferencia_id_transferencia(int Transferencia_id_transferencia) {
        this.Transferencia_id_transferencia = Transferencia_id_transferencia;
    }

  
    
    
}
