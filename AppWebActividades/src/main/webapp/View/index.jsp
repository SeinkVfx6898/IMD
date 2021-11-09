

<%@page import="com.arelance.empresa.imd.domain.Cliente"%>
<%@page import="com.arelance.empresa.imd.domain.Actividad"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Página principal</title>
        <%@include file = "../JSPF/index.jspf"%>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-sm bg-info navbar-info">     
                <a id="IMD">IMD</a> 
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <% if (request.getSession().getAttribute("cliente") != null) {
                                Cliente cliente = (Cliente) request.getSession().getAttribute("cliente");
                        %>
                        <a class="nav-link" href="PreActividadInscritoServlet"><%=cliente.getNick()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CierreSesion">Cerrar sesion</a>
                    </li>
                    <%} else {%>
                    <li class="nav-item">
                        <a class="nav-link" href="PreRegistroServlet">Registro</a>
                    </li>        
                    <li class="nav-item">
                        <a class="nav-link" href="PreLoginServlet">Iniciar sesión</a>
                        <%}%>
                    </li>          
                </ul>
            </nav>
            <h3>En IMD contamos con las actividades<br> que más se ajustan a tu perfil:</h3>
        </header>
        <form action="PreIndexServlet" method="GET">
            <input  type="search" class="form-control" id="myInput" value="${filtro}"  placeholder="Busca una actividad..." title=" Busca una actividad..." maxlength="20" name="filtro"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters">>
            <input type="submit"value="Buscar"class="btn btn-warning">
        </form>
        <br>
        <ul id="myUL">
            <%
                List<Actividad> lista = (List<Actividad>) request.getAttribute("lista");
                for (Actividad actividad : lista) {
            %>
            <li>
                <a href="PreInscripcionServlet?idActividad=<%= actividad.getIdActividad()%>"><%=actividad.getNombre()%></a>
            </li>
            <%
                }
            %>
        </ul>
        <p>${Msg}</p>
        &copy;2021-2022 IMD S.A.Todos los derechos reservados.
    </footer>
</body>
</html>