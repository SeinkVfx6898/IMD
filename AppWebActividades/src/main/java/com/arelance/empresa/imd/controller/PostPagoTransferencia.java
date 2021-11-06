/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.controller;

import com.arelance.empresa.imd.domain.Actividad;
import com.arelance.empresa.imd.domain.Cliente;
import com.arelance.empresa.imd.domain.Inscripciontransferencia;
import com.arelance.empresa.imd.domain.Metodopagotransferencia;
import com.arelance.empresa.imd.domain.Transferencia;
import com.arelance.empresa.servicios.ActividadService;
import com.arelance.empresa.servicios.ClienteService;
import com.arelance.empresa.servicios.InscripcionTransferenciaService;
import com.arelance.empresa.servicios.MetodoPagoTransferenciaService;
import com.arelance.empresa.servicios.TransferenciaService;
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
 * @author lenovo
 */
@WebServlet(name = "PostPagoTransferencia", urlPatterns = {"/PostPagoTransferencia"})
public class PostPagoTransferencia extends HttpServlet {

    @Inject
    private TransferenciaService transferenciaService;
    @Inject
    private MetodoPagoTransferenciaService metodoPagoTransferenciaService;
    @Inject
    private InscripcionTransferenciaService inscripcionTransferenciaService;
    @Inject
    private ActividadService actividadService;
    @Inject
    private ClienteService clienteService;

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
        String iban = request.getParameter("iban");
        String concepto = request.getParameter("concepto");
        int idActividad = Integer.parseInt(request.getParameter("id_actividad"));
        Transferencia transferencia = new Transferencia(iban, concepto);
        Cliente cliente = clienteService.SacarID((Cliente) request.getSession().getAttribute("cliente"));
        Cliente c = new Cliente(cliente.getIdCliente());
        Actividad actividad = new Actividad(idActividad);
        transferenciaService.AñadirTransferencia(transferencia);
        Metodopagotransferencia metodopagotransferencia = new Metodopagotransferencia(metodoPagoTransferenciaService.obteneridTransferencia());
        metodoPagoTransferenciaService.AñadirPagoTransferencia(metodopagotransferencia);
        Metodopagotransferencia metodo = inscripcionTransferenciaService.ObtenerIdTransferencia();
        Inscripciontransferencia inscripciontransferencia = new Inscripciontransferencia(actividad,c,metodo);
        inscripcionTransferenciaService.guardar(inscripciontransferencia);
        request.getRequestDispatcher("PreActividadInscritoServlet").forward(request, response);
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
