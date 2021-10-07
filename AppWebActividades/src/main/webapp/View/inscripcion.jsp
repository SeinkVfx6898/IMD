<%-- 
    Document   : inscripcion
    Created on : 09-sep-2021, 18:05:34
    Author     : lenovo
--%>

<%@page import="com.arelance.empresa.imd.domain.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <%@include file = "../JSPF/inscripcion.jspf"%>
        <title>Inscripción</title>
    </head>
    <body> 
       <header>
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark">     
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
        <form action="../" method="GET" id="tarjeta">
            <fieldset>
                <div id="contenedor">
                    <legend>Pago por tarjeta:</legend>
                    <div class="form-group">
                        <label for="text">Número:</label>
                        <input type="number" class="form-control" id="numeroTarjeta" placeholder="1234567891234567" name="numeroTarjeta" pattern="[0-9]{16}">
                    </div>
                    <div class="form-group">
                        <label for="text">Fecha caducidad</label>
                        <input type="text" class="form-control" id="Fecha_caducidad" placeholder="03/25" name="Fecha_caducidad" maxlength="5">
                    </div>
                    <div class="form-group">
                        <label for="text">CVV</label>
                        <input type="number" class="form-control" id="CVV" placeholder="583" pattern="[0-9]{3}" name="CVV">
                    </div>
                    <input type="submit" class="btn btn-secondary"name="action"value="Continuar">
                    <input type="reset"class="btn btn-secondary"name="action"value="Limpiar">
                    <input type="submit"class="btn btn-secondary"name="action" value="Volver" formaction="PreIndexServlet">
                </div>
            </fieldset>
        </form>
        <form action="../" method="GET" id="transferencia">
                <div id="contenedor2">
                    <legend>Pago por transferencia:</legend>
                    <div class="form-group">
                        <label for="iban">IBAN:</label>
                        <input type="text" class="form-control" id="iban" placeholder="1234567891234567" name="iban" pattern="[0-9]{16}>
                    </div>
                    <div class="form-group">
                        <label for="concepto">Copcepto de pago:</label>
                        <input type="text" class="form-control" id="concepto" placeholder="pago deporte" name="concepto">
                    </div>
                    <input type="submit" class="btn btn-secondary"name="action"value="Continuar">
                    <input type="reset"class="btn btn-secondary"name="action"value="Limpiar">
                    <input type="submit"class="btn btn-secondary"name="action" value="Volver" formaction="PreIndexServlet">
                </div>
            </fieldset>
        </form>
    </body>
</html>
