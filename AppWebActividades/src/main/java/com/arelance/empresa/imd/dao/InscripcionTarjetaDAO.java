/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.dao;


import com.arelance.empresa.imd.domain.Inscripciontarjeta;
import com.arelance.empresa.imd.domain.Metodopagotarjeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface InscripcionTarjetaDAO {

    public List<Inscripciontarjeta> obtener();

    public void guardar(Inscripciontarjeta inscripciontarjeta);

    public void modificar(Inscripciontarjeta inscripciontarjeta);

    public void eliminar(Inscripciontarjeta inscripciontarjeta);
    
    public Metodopagotarjeta ObtenerIdTarjeta();

}
