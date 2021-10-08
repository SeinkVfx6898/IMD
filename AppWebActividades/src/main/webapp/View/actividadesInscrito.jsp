<%-- 
    Document   : actividades_Inscrito
    Created on : 8 oct. 2021, 10:59:06
    Author     : Manuel
--%>

<%@page import="com.arelance.empresa.imd.domain.Actividad"%>
<%@page import="java.util.List"%>
<%@page import="com.arelance.empresa.imd.domain.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <%@include file = "../JSPF/actividadesInscrito.jspf"%>
        <title>Actividades_Inscrito</title>
    </head>
    <body> 
        <header>
            <nav class="navbar navbar-expand-sm bg-info navbar-info">     
                <a class="navbar-brand" href="PreIndexServlet">IMD</a> 
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <% if (request.getSession().getAttribute("cliente") != null) {
                                Cliente cliente = (Cliente) request.getSession().getAttribute("cliente");
                        %>
                        <a class="nav-link"><%=cliente.getNick()%></a>
                        <%} else {%>
                        <a class="nav-link" href="PreRegistroServlet">Registro</a>
                        <%}%>
                    </li>
                    <li class="nav-item">
                        <% if (request.getSession().getAttribute("cliente") != null) {%>
                        <a class="nav-link" href="CierreSesion">Cerrar sesion</a>
                        <%} else {%>
                        <a class="nav-link" href="PreLoginServlet">Iniciar sesión</a>
                        <%}%>
                    </li>          
                </ul>
            </nav>
        </header>
        <input  type="text" class="form-control" id="myInput" onkeyup="myFunction(this)" placeholder="Busca una actividad..." title="Type in a name">
        <ul id="myUL">
            <%
                List<Actividad> lista = (List<Actividad>) request.getAttribute("lista");
                for (Actividad actividad : lista) {
            %>
            <li>
                <a><%=actividad.getNombre()%></a>
            </li>
            <%
                }
            %>

        </ul>
</html>
