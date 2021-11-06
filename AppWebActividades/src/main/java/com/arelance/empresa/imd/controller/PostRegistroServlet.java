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
        String nombre = null;
        String apellido = null;
        String telefono = null;
        String email = null;
        String nick = null;
        String password = null;
        String password2 = null;

        if (request.getParameter("nombre").trim().length() == 0 || request.getParameter("apellido").trim().length() == 0
                || request.getParameter("tlf").trim().length() == 0 || request.getParameter("email").trim().length() == 0
                || request.getParameter("nick").trim().length() == 0 || request.getParameter("pass").trim().length() == 0
                || request.getParameter("passconfirm").trim().length() == 0) {
            if (request.getParameter("nombre").trim().length() != 0) {
                nombre = request.getParameter("nombre");
            } else {
                request.setAttribute("NickMsg", "El nick no esta relleno.");
            }
            if (request.getParameter("apellido").trim().length() != 0) {
                apellido = request.getParameter("apellido");
            } else {
                request.setAttribute("ApeMsg", "El apellido no esta relleno.");
            }
            if (request.getParameter("tlf").trim().length() != 0) {
                telefono = request.getParameter("tlf");
            } else {
                request.setAttribute("TlfMsg", "El telefono no esta relleno.");
            }
            if (request.getParameter("email").trim().length() != 0) {
                email = request.getParameter("email");
            } else {
                request.setAttribute("EmailMsg", "El email no esta relleno.");
            }
            if (request.getParameter("nick").trim().length() != 0) {
                nick = request.getParameter("nick");
            } else {
                request.setAttribute("NickMsg", "El nick no esta relleno.");
            }
            if (request.getParameter("pass").trim().length() != 0) {
                password = request.getParameter("pass");
            } else {
                request.setAttribute("PassMsg", "La contraseña no esta relleno.");
            }
            if (request.getParameter("passconfirm").trim().length() != 0) {
                password2 = request.getParameter("passconfirm");
            } else {
                request.setAttribute("PassMsg", "La comprobacion de contraseña no esta relleno.");
            }
            request.getRequestDispatcher("View/registro.jsp").forward(request, response);
        } else if (!password.equals(password2)) {
            request.setAttribute("PassMsg", "Las contraseñas no coinciden.");
            request.getRequestDispatcher("View/registro.jsp").forward(request, response);
        } else {
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

                request.getRequestDispatcher("View/registro.jsp").forward(request, response);
            }
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
