
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.imd.modelo;

import com.arelance.empresa.dao.servicios.LoginServiceImpl;
import com.arelance.empresa.imd.beans.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class Navigation {

    //Declaramos los metodos que nos permitirá navegar por nuestra web.
    public static String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("View/login.jsp");
        return "View/login.jsp";
    }

    public static String registro(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("View/datospersonales.jsp");
        return "View/datospersonales.jsp";

    }

    public static String index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("IndexController");
        return "IndexController";
    }
       public static String registroParte2(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
          String nombre=request.getParameter("nombre");
          String apellido=request.getParameter("apellido");
          String tlf=request.getParameter("tlf");
          request.setAttribute("nombre",nombre);
          request.setAttribute("apellido",apellido);
          request.setAttribute("tlf", tlf);
        request.getRequestDispatcher("../View/datoslogin").forward(request, response);
        return "../View/datoslogin.jsp";
    }
    public static List<Cliente> altaCliente(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String tlf = request.getParameter("tlf");
        String nick = request.getParameter("nick");
        String email = request.getParameter("email");
        String pswd = request.getParameter("pswd");
        String confirmpswd = request.getParameter("confirmpswd");
        Cliente cliente = new Cliente(nombre, apellido, tlf, nick, email, pswd);
        List<Cliente> listaClientes = new ArrayList<>();
        LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
        listaClientes.add(cliente);
        listaClientes = loginServiceImpl.verificar(cliente);
        for (Cliente listaCliente : listaClientes) {
            if (listaCliente.getEmail().equalsIgnoreCase(email)) {
                request.setAttribute("msgErrorEmail", "Este email ya existe.");
                request.getRequestDispatcher("View/datoslogin.jsp").forward(request, response);
            }
            if (listaCliente.getTelefono().equals(tlf)) {
                request.setAttribute("msgErrorTlf", "Este Teléfono ya existe.");
                request.getRequestDispatcher("View/datospersonales.jsp").forward(request, response);
            }
        }
        if (!pswd.equals(confirmpswd)) {
            request.setAttribute("msgErrorPass", "Las contraseñas no coinciden.");
            request.getRequestDispatcher("View/datoslogin.jsp").forward(request, response);
        }
        if (listaClientes.size() > 0) {
            request.setAttribute("msgErrorNick", "Este nick ya existe.");
            request.getRequestDispatcher("View/datoslogin.jsp").forward(request, response);
        } else {
            loginServiceImpl.Registrar(cliente);
            request.getRequestDispatcher("View/login.jsp").forward(request, response);
        }
        return listaClientes;
    }
}
