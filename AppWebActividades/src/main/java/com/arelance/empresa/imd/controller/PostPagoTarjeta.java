/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.controller;

import com.arelance.empresa.imd.domain.Actividad;
import com.arelance.empresa.imd.domain.Cliente;
import com.arelance.empresa.imd.domain.Inscripciontarjeta;
import com.arelance.empresa.imd.domain.Tarjetacredito;
import com.arelance.empresa.servicios.ActividadService;
import com.arelance.empresa.servicios.InscripcionTarjetaService;
import com.arelance.empresa.servicios.TarjetaCreditoService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel
 */
@WebServlet(name = "PostPagoTarjeta", urlPatterns = {"/PostPagoTarjeta"})
public class PostPagoTarjeta extends HttpServlet {

    @Inject
    private TarjetaCreditoService tarjetaService;
    @Inject
    private InscripcionTarjetaService inscripcionTarjetaService;
    @Inject
    private ActividadService actividadService;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int numeroTarjeta = Integer.parseInt(request.getParameter("numeroTarjeta"));
            String fecha = request.getParameter("Fecha_caducidad");
            int cvv = Integer.parseInt(request.getParameter("numeroTarjeta"));
            int idActividad = Integer.parseInt(request.getParameter("id_actividad"));
            Tarjetacredito tarjeta = new Tarjetacredito(numeroTarjeta, fecha, cvv);
            tarjetaService.AñadirTarjeta(tarjeta);
            Cliente cliente = (Cliente) request.getSession().getAttribute("cliente");
            Actividad actividad =  actividadService.EncontrarActividadPorID(idActividad);
            request.getRequestDispatcher("PreActividadInscritoServlet").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
