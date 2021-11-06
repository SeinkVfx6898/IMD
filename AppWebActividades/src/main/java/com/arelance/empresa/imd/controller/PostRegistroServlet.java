/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.controller;

import com.arelance.empresa.imd.domain.Cliente;
import com.arelance.empresa.servicios.ClienteService;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "PostRegistroServlet", urlPatterns = {"/PostRegistroServlet"})
public class PostRegistroServlet extends HttpServlet {

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
    private ClienteService clienteService;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("tlf");
        String email = request.getParameter("email");
        String nick = request.getParameter("nick");
        String password = request.getParameter("pass");
        String password2 = request.getParameter("passconfirm");
        Cliente cliente = new Cliente(nombre, apellido, telefono, email, nick, password);

        if (clienteService.ComprobarRegistro(cliente) != null) {
            clienteService.AñadirCliente(cliente);
            request.getRequestDispatcher("View/login.jsp").forward(request, response);
        } else {
            if (clienteService.EncontrarClientePorNick(cliente) == null) {
                request.setAttribute("NickMsg", "Este nick ya existe.");
            }
            if (clienteService.EncontrarClientePorTelefono(cliente) == null) {
                request.setAttribute("TlfMsg", "Este teléfono ya existe.");
            }
            if (clienteService.EncontrarClientePorEmail(cliente) == null) {
                request.setAttribute("EmailMsg", "Este email ya existe.");
            }
            if (!password.equals(password2)) {
                request.setAttribute("PassMsg", "Las contraseñas no coinciden.");
            }
            request.getRequestDispatcher("View/registro.jsp").forward(request, response);
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
