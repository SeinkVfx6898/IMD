<%-- 
    Document   : registro
    Created on : 06-sep-2021, 18:39:18
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Registro</title>
        <%@include file = "../JSPF/datoslogin.jspf"%>
    </head>
    <body>
        <div class="container">
            <h3>¡Estas más cerca del disfrute!</h3>
            <form action="../MainController?action=Registrarse">
                <div class="form-group">
                    <label for="text">Nick:</label>
                    <input type="text" class="form-control" id="nick" placeholder="SalvSolo" name="nick" maxlength="20">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" id="email" placeholder="sgzurita@gmail.com" name="email" maxlength="30">
                </div>
                <div class="form-group">
                    <label for="pwd">Contraseña:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="SalvSolo1234" name="pswd" maxlength="20">
                </div>
                <div class="form-group">
                    <label for="pwd">Confirmar contraseña:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="SalvSolo1234" name="confirmpswd" maxlength="20">
                </div>
                <input type="submit" class="btn btn-secondary" name="action"value="Registrarse">
                <input type="reset"class="btn btn-secondary"name="action"value="Limpiar">
            </form>
        </div>
    </body>
</html>
