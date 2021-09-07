<%-- 
    Document   : index
    Created on : 06-sep-2021, 18:06:20
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="./metas.jspf" %>
        <title>Página principal</title>
    </head>
    <body>
        <header>
            <h2>
                IMD
            </h2>
        </header>
        <nav>

            <a href="MainController?action=Registro">Registro</a>
            <a href="MainController?action=Login">Iniciar sesión</a>
        </nav>


        <footer>
            &copy;2021-2022 IMD S.A.Todos los derechos reservados.
        </footer>
    </body>
</html>
