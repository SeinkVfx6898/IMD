<%-- 
    Document   : confirmacionCliente
    Created on : 13-nov-2021, 11:56:50
    Author     : lenovo
--%>
<%@page import="com.arelance.empresa.imd.domain.Cliente"%>
<!DOCTYPE html>
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
        <form action="PostDeleteClienteServlet" method="GET">
            <p>¿Estas seguro que quieres Eliminar tu cuenta <%=cliente.getNombre()%>?</p>
            <input class="btn btn-warning" type="submit"name="action"value="Si">
            <input class="btn btn-danger" type="submit"name="action"value="No">
        </form>

    </body>
</html>
