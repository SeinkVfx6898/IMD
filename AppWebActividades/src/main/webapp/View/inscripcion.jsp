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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <title>Inscripción</title>


    </head>
    <body>   
        <div class="container">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Precio</th>
                        <th>Dia de la semana</th>
                        <th>Hora de inicio</th>
                        <th>Hora de fín</th>
                        <th>Entrenador</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>${actividad.getNombre()}</td>
                        <td>${actividad.getDescripcion()}</td>
                        <td>${actividad.getPrecio()}&#8364;</td>
                        <td>${actividad.getDiaSemana()}</td>
                        <td>${actividad.getHoraInicio()}</td>
                        <td>${actividad.getHoraFin()}</td>
                        <td>${actividad.getEntrenador()}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
