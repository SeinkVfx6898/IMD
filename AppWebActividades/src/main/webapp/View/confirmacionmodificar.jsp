<%-- 
    Document   : confirmacionmodificar
    Created on : 13-nov-2021, 15:07:20
    Author     : lenovo
--%>

<%@page import="java.util.List"%>
<%@page import="com.arelance.empresa.imd.domain.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Confirmación</title>
        <%@include file = "../JSPF/login.jspf"%>
    </head>
    <body>
        <%
            Cliente cliente = (Cliente) request.getAttribute("cliente");
        %>
        <%

        %>      
        <form action="PostModificarClienteServlet" method="GET">
            <p>¿Estas seguro que quieres modificar los datos de <%= cliente.getNick()%>?</p>
            <input class="btn btn-warning" type="submit"name="action"value="Si">
            <input class="btn btn-danger" type="submit"name="action"value="No">
            <input type="hidden"name="nombre" value="${nombre}">
            <input type="hidden"name="apellido"value="${apellido}">
            <input type="hidden"name="nick"value="${nick}">
            <input type="hidden"name="password"value="${password}">
            <input type="hidden"name="tlf"value="${telefono}">
            <input type="hidden"name="correo"value="${correo}">
        </form>

    </body>
</html>