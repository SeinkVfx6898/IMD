/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.dao;

import com.arelance.empresa.imd.domain.Metodopagotransferencia;
import com.arelance.empresa.imd.domain.Transferencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface MetodoPagoTransferenciaDAO {

    public List<Metodopagotransferencia> obtener();//Obtener todos los metodos de pago por transferencia

    public void AñadirPagoTransferencia(Metodopagotransferencia metodopagotransferencia);//Añadir un metodo de pago por transferencia

    public void ModificarPagoTransferencia(Metodopagotransferencia metodopagotransferencia);//Modificar un metodo de pago por transferencia

    public void RemoverPagoTransferencia(Metodopagotransferencia metodopagotransferencia);//Eliminar un metodo de pago por transferencia

    public Transferencia ObtenerIdTransferencia();//Obtener la id de la tarjeta
}
