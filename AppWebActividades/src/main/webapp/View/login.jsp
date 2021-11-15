<%-- 
    Document   : login
    Created on : 06-sep-2021, 18:39:10
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Login</title>
        <%@include file = "../JSPF/login.jspf"%>
    </head>
    <main>
        <h3>Cada día numerosos grupos de personas disfrutan de nuestras actividades.<br>
            ¡Forma parte de nosotros para disfrutar también!</h3>
        <form action="/AppWebActividades/PostLoginServlet" class="formulario" id="formulario" method="GET">           
            <div class="formulario__grupo" id="grupo__usuario">
                <label for="usuario" class="formulario__label">Nick:</label>
                <div class="formulario__grupo-input">
                    <input type="text" class="formulario__input" name="usuario" id="usuario" placeholder="Introduzca su nick..." maxlength="16" required>
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p style="color: red">${NickMsg}</p>
                <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
            </div>
            <div class="formulario__grupo" id="grupo__password">
                <label for="password" class="formulario__label">Contraseña</label>
                <div class="formulario__grupo-input">
                    <input type="password" class="formulario__input" name="password" id="password" placeholder="Introduzca su contraseña..." maxlength="12" required>
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p style="color: red">${PassMsg}</p>
                <p class="formulario__input-error">La contraseña tiene que ser de 4 a 12 dígitos.</p>
            </div>
            <div class="formulario__grupo formulario__grupo-btn-enviar">
                <input type="submit" class="btn btn-info" value="Acceder" name="action">
                <input type="reset" value="Limpiar" class="btn btn-info">
                <a href="/AppWebActividades/PreIndexServlet" class="btn btn-info"role="button">Volver</a>
            </div>
        </form>
    </main>
    <br>
    <script src="/AppWebActividades/JS/formulario.js"></script>
    <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
</body>
</html>