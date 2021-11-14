/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.controller;

import com.arelance.empresa.imd.domain.Cliente;
import com.arelance.empresa.servicios.ClienteService;
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
@WebServlet(name = "PostModificarClienteServlet", urlPatterns = {"/PostModificarClienteServlet"})
public class PostModificarClienteServlet extends HttpServlet {

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
    ClienteService clienteService;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String nick = request.getParameter("nick");
        String email = request.getParameter("correo");
        String telefono = request.getParameter("tlf");
        String password = request.getParameter("password");
        String action = request.getParameter("action");
        if (action.equals("No")) {
            request.getRequestDispatcher("PreActividadInscritoServlet").forward(request, response);
        } else if (action.equals("Si")) {
            Cliente cliente = clienteService.SacarID((Cliente) request.getSession().getAttribute("cliente"));
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setNick(nick);
            cliente.setEmail(email);
            cliente.setPassword(password);
            cliente.setTelefono(telefono);
            clienteService.ModificarCliente(cliente); 
            request.getSession().invalidate();
            request.getRequestDispatcher("PreIndexServlet").forward(request, response);
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
