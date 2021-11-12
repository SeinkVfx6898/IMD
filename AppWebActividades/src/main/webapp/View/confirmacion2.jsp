<%-- 
    Document   : confirmacion2
    Created on : 12 nov. 2021, 12:42:59
    Author     : usuar
--%>

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
        <form action="PostDeleteActividadTransfeServlet" method="GET">
            <p>¿Estas seguro que quieres dejar de asistir a <%= actividad.getNombre()%>?</p>
            <input class="btn btn-warning" type="submit"name="action"value="Si">
            <input class="btn btn-danger" type="submit"name="action"value="No">
            <input type="hidden"name="idActividad" value="<%= actividad.getIdActividad()%>">
            <input type="hidden"name="idCliente"value="${idCliente}">
        </form>

    </body>
</html>
