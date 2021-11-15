<%-- 
    Document   : modificar
    Created on : 11-nov-2021, 0:59:13
    Author     : lenovo
--%>

<%@page import="com.arelance.empresa.imd.domain.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Modificar</title>
        <%@include file = "../JSPF/datospersonales.jspf"%>
        <link rel="stylesheet" href="../CSS/estilos.css">
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
    </head>
    <body>
        <%
            Cliente cliente = (Cliente) request.getAttribute("cliente");
        %>
        <main>
            <h3>Cada día numerosos grupos de personas disfrutan de nuestras actividades.<br>
                ¡Forma parte de nosotros para disfrutar también!</h3>
            <form action="PreConfirmacionModificar" class="formulario" id="formulario" method="GET">           
                <input type="hidden" name="id" value="${cliente.getIdCliente()}">
                <div class="formulario__grupo" id="grupo__nombre">
                    <label for="nombre" class="formulario__label">Nombre</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="nombre" id="nombre" placeholder="${cliente.getNombre()}" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
                </div>
                <div class="formulario__grupo" id="grupo__apellido">
                    <label for="nombre" class="formulario__label">Apellido</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="apellido" id="apellido" placeholder="${cliente.getApellido()}" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p class="formulario__input-error">El apellido tiene que ser de 4 a 16 dígitos y solo puede contener letras.</p>
                </div>
                <div class="formulario__grupo" id="grupo__usuario">
                    <label for="usuario" class="formulario__label">Nick:</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="usuario" id="usuario" placeholder="${cliente.getNick()}" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${NickMsg}</p>
                    <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
                </div>
                <div class="formulario__grupo" id="grupo__correo">
                    <label for="correo" class="formulario__label">Correo Electrónico</label>
                    <div class="formulario__grupo-input">
                        <input type="email" class="formulario__input" name="correo" id="correo" placeholder="${cliente.getEmail()}" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${EmailMsg}</p>
                    <p class="formulario__input-error">El correo solo puede contener letras, numeros, puntos, guiones y guion bajo.</p>
                </div>

                <div class="formulario__grupo" id="grupo__password">
                    <label for="password" class="formulario__label">Contraseña</label>
                    <div class="formulario__grupo-input">
                        <input type="password" class="formulario__input" name="password" id="password" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p class="formulario__input-error">La contraseña tiene que ser de 4 a 12 dígitos.</p>
                </div>
                <div class="formulario__grupo" id="grupo__password2">
                    <label for="password2" class="formulario__label">Repetir Contraseña</label>
                    <div class="formulario__grupo-input">
                        <input type="password" class="formulario__input" name="password2" id="password2" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p class="formulario__input-error">Ambas contraseñas deben ser iguales.</p>
                </div>


                <div class="formulario__grupo" id="grupo__telefono">
                    <label for="telefono" class="formulario__label">Teléfono</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="telefono" id="telefono" placeholder="${cliente.getTelefono()}" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${TlfMsg}</p>
                    <p class="formulario__input-error">El telefono solo puede contener numeros y el maximo son 14 dígitos.</p>
                </div>
                <div class="formulario__grupo formulario__grupo-btn-enviar">
                    <input type="submit" class="btn btn-info" value="Modificar" name="action">
                    <input type="reset" value="Limpiar" class="btn btn-info">
                    <a href="PreActividadInscritoServlet" class="btn btn-info"role="button">Volver</a>
                </div>
            </form>
        </main>
        <br>
        <script src="../JS/formulario.js"></script>
        <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    </body>
</html>
