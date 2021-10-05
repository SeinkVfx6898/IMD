<%-- 
    Document   : inscripcion
    Created on : 09-sep-2021, 18:05:34
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <%@include file = "../JSPF/inscripcion.jspf"%>
        <title>Inscripción</title>
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
        <br>
        <div class="container">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Precio</th>
                        <th>Entrenador</th>
                        <th>Dia de la semana</th>
                        <th>Hora de inicio</th>
                        <th>Hora de fín</th>

                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>${actividad.getNombre()}</td>
                        <td>${actividad.getDescripcion()}</td>
                        <td>${actividad.getPrecio()}&#8364;</td>
                        <td>${actividad.getEntrenador()}</td>
                        <td>${actividad.getDiaSemana()}</td>
                        <td>${actividad.getHoraInicio()}</td>
                        <td>${actividad.getHoraFin()}</td>

                    </tr>
                </tbody>
            </table>
        </div>
        <form action="http://localhost:8080/AppWebActividades/PostMetodoPagoServlet" method="GET" class="centrado">
            <fieldset>
                <input type="submit" class="btn btn-secondary" name="action" value="Pago por tarjeta">
                <input type="submit" class="btn btn-secondary" name="action" value="Pago por transferencia">
                <input type="submit" class="btn btn-secondary" name="action" value="Volver" formaction="PreIndexServlet">
                </div>
            </fieldset>
        </form>
    </body>
</html>
