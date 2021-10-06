<%-- 
    Document   : index
    Created on : 06-sep-2021, 18:06:20
    Author     : lenovo
--%>

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
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">     
            <a class="navbar-brand" href="PreIndexServlet">IMD</a> 
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="PreRegistroServlet">Registro</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="PreLoginServlet">Iniciar sesión</a>
                </li>          
            </ul>
            
        </nav>
        <header>
            <h3>En IMD contamos con las actividades<br> que más se ajustan a tu perfil:</h3>
        </header>
        <input  type="text"class="form-control" id="myInput" onkeyup="myFunction(this)" placeholder="Busca una actividad..." title="Type in a name">
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
        <aside>
            <p>Publicidad</p>
        </aside>
        <footer>
            &copy;2021-2022 IMD S.A.Todos los derechos reservados.
        </footer>
        <!-- sacar de aqui urgente -->
        <script>
            function myFunction(input) {
                var filter, ul, li, a, i, txtValue;
                input = document.getElementById("myInput");
                filter = input.value.toUpperCase();
                ul = document.getElementById("myUL");
                li = ul.getElementsByTagName("li");
                for (i = 0; i < li.length; i++) {
                    a = li[i].getElementsByTagName("a")[0];
                    txtValue = a.textContent || a.innerText;
                    if (txtValue.toUpperCase().indexOf(filter) > -1) {
                        li[i].style.display = "";
                    } else {
                        li[i].style.display = "none";
                    }
                }
            }
        </script>
    </body>
</html>
