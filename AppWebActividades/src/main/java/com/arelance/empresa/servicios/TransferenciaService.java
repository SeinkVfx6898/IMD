/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;


import com.arelance.empresa.imd.domain.Transferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface TransferenciaService {
    
   public List<Transferencia> obtener();
    
    public void AñadirTransferencia(Transferencia transferencia);// AñadirNumeroCuenta

    public void ModificarTransferencia(Transferencia transferencia);

    public void RemoverTransferencia(Transferencia transferencia);
}
