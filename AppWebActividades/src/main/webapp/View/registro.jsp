<%-- 
    Document   : registro2
    Created on : 07-sep-2021, 16:34:33
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Registro</title>
        <%@include file = "../JSPF/datospersonales.jspf"%>
    </head>
    <body>
        <main>
            <h3>Cada día numerosos grupos de personas disfrutan de nuestras actividades.<br>
                ¡Forma parte de nosotros para disfrutar también!</h3>
            <form action="/AppWebActividades/PostRegistroServlet" class="formulario" id="formulario" method="POST">           
                <div class="formulario__grupo" id="grupo__usuario">
                    <label for="usuario" class="formulario__label">Nick:</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="usuario" id="usuario" placeholder="Introduce un nick..." required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${NickMsg}</p>
                    <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
                </div>
                <div class="formulario__grupo" id="grupo__nombre">
                    <label for="nombre" class="formulario__label">Nombre</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="nombre" id="nombre" placeholder="Introduzca su nombre..." required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${NomMsg}</p>
                    <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
                </div>
                <div class="formulario__grupo" id="grupo__apellido">
                    <label for="nombre" class="formulario__label">Apellido</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="apellido" id="apellido" placeholder="Introduzca su apellido..." required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${ApeMsg}</p>
                    <p class="formulario__input-error">El apellido tiene que ser de 4 a 16 dígitos y solo puede contener letras.</p>
                </div>
                <div class="formulario__grupo" id="grupo__password">
                    <label for="password" class="formulario__label">Contraseña</label>
                    <div class="formulario__grupo-input">
                        <input type="password" class="formulario__input" name="password" id="password" placeholder="Introduzca su contraseña..." required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <P style="color: red">${passMsg}</P>
                    <p class="formulario__input-error">La contraseña tiene que ser de 4 a 12 dígitos.</p>
                </div>
                <div class="formulario__grupo" id="grupo__password2">
                    <label for="password2" class="formulario__label">Repetir Contraseña</label>
                    <div class="formulario__grupo-input">
                        <input type="password" class="formulario__input" name="password2" placeholder="Repetir la contraseña..." id="password2" required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <P style="color: red">${passMsg2}</P>
                    <p class="formulario__input-error">Ambas contraseñas deben ser iguales.</p>
                </div>
                <div class="formulario__grupo" id="grupo__correo">
                    <label for="correo" class="formulario__label">Correo Electrónico</label>
                    <div class="formulario__grupo-input">
                        <input type="email" class="formulario__input" name="correo" id="correo" placeholder="Introduzca su correo..." required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${EmailMsg}</p>
                    <p class="formulario__input-error">El correo solo puede contener letras, numeros, puntos, guiones y guion bajo.</p>
                </div>
                <div class="formulario__grupo" id="grupo__telefono">
                    <label for="telefono" class="formulario__label">Teléfono</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input" name="telefono" id="telefono" placeholder="Introduzca su numero de telefono..." required>
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p style="color: red">${TlfMsg}</p>
                    <p class="formulario__input-error">El telefono solo puede contener numeros y el maximo son 14 dígitos.</p>
                </div>
                <div class="formulario__grupo formulario__grupo-btn-enviar">
                    <input type="submit" class="btn btn-info" value="Registrarse" name="action">
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
