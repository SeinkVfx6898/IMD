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
        <h3>Cada día numerosos grupos de personas disfrutan de nuestras actividades.<br>
            ¡Forma parte de nosotros para disfrutar también!</h3>

        <form action="../PostRegistroServlet" method="GET" id="registro">
            <fieldset>
                <div id="contenedor">
                    <legend>Datos personales:</legend>
                    <div class="form-group">
                        <label for="text">Nombre:</label>
                        <input type="text" class="form-control" id="nombre" placeholder="Agustín" name="nombre" maxlength="30"required>
                    </div>
                    <div class="form-group">
                        <label for="text">Apellido:</label>
                        <input type="text" class="form-control" id="apellido" placeholder="Rodríguez" name="apellido" maxlength="30"required>
                    </div>
                    <div class="form-group">
                        <label for="tlf">Teléfono:</label>
                        <input type="tlf" class="form-control" id="tlf" placeholder="+34743618904"pattern="[0-9]{9}" name="tlf"required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email" placeholder="Agustin98@gmail.com" name="email"required>
                    </div>
                </div>
                <div id="contenedor2">
                    <legend>Datos login:</legend>
                    <div class="form-group">
                        <label for="nick">Nick:</label>
                        <input type="text" class="form-control" id="nick" placeholder="Amr98" name="nick"required>
                    </div>
                    <div class="form-group">
                        <label for="psw">Contraseña:</label>
                        <input type="password" class="form-control" id="psw" placeholder="amr12345" name="pass"required>
                    </div>
                    <div class="form-group">
                        <label for="pswc">Confirmar contraseña:</label>
                        <input type="password" class="form-control" id="pswc" placeholder="amr12345" name="passconfirm"required>
                    </div>

                    <input type="submit" class="btn btn-secondary"name="action"value="Continuar">
                    <input type="reset"class="btn btn-secondary"name="action"value="Limpiar">
                    <a href="../PreIndexServlet" class="btn btn-info"role="button">Volver</a>
                </div>
            </fieldset>
        </form>
        <br>
        <span>${NickMsg}</span>
        <span>${TlfMsg}</span>
        <span>${EmailMsg}</span>
        <span>${PassMsg}</span>
    </body>
</html>
