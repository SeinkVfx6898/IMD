<%-- 
    Document   : confirmacion
    Created on : 11-nov-2021, 18:01:15
    Author     : lenovo
--%>

<%@page import="com.arelance.empresa.imd.domain.Inscripciontarjeta"%>
<%@page import="com.arelance.empresa.imd.domain.Actividad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Confirmación</title>
        <%@include file = "../JSPF/login.jspf"%>
    </head>
    <body>
        <%
            Actividad actividad = (Actividad) request.getAttribute("actividad");
        %>
        <form action="ComprobadorSerlet" method="GET">
            <p>¿Estas seguro que quieres dejar de asistir a <%= actividad.getNombre()%>?</p>
            <input class="btn btn-warning" type="submit"name="action"value="Si">
            <input class="btn btn-danger" type="submit"name="action"value="No">
            <input type="hidden"name="idActividad" value="<%= actividad.getIdActividad()%>">
            <input type="hidden"name="idCliente"value="${idCliente}">
        </form>

    </body>
</html>
