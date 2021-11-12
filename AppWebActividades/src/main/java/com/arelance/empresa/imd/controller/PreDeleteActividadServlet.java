/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.controller;

import com.arelance.empresa.imd.domain.Actividad;
import com.arelance.empresa.imd.domain.Cliente;
import com.arelance.empresa.imd.domain.Inscripciontarjeta;
import com.arelance.empresa.servicios.ActividadService;
import com.arelance.empresa.servicios.ClienteService;
import com.arelance.empresa.servicios.InscripcionTarjetaService;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "PreDeleteActividadServlet", urlPatterns = {"/PreDeleteActividadServlet"})
public class PreDeleteActividadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Inject
    private InscripcionTarjetaService tarjetaService;

    @Inject
    private ClienteService clienteService;
    @Inject
    private ActividadService actividadService;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cliente = clienteService.SacarID((Cliente) request.getSession().getAttribute("cliente"));
        int cliente2 = cliente.getIdCliente();
        request.setAttribute("idCliente",cliente2);
        int idActividad = Integer.parseInt(request.getParameter("idActividad"));
        Actividad actividad=actividadService.EncontrarActividadPorID(idActividad);
        request.setAttribute("actividad",actividad);
        Inscripciontarjeta inscripciontarjeta = tarjetaService.ObtenerInscripcion(cliente2, idActividad);
        request.setAttribute("tarjetaborrar", inscripciontarjeta);
        request.getRequestDispatcher("View/confirmacion.jsp").forward(request, response);

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