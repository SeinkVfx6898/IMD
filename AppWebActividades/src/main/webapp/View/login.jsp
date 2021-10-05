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
    <body>
        <h3>Accede a tu cuenta:</h3>
        <form action="http://localhost:8080/AppWebActividades/PostLoginServlet">
            <div class="form-group">
                <label for="text">Nick:</label>
                <input type="text" class="form-control" id="nombre" placeholder="SalvSolo" name="nick" maxlength="20">
            </div>
            <div class="form-group">
                <label for="pwd">Contraseña:</label>
                <input type="password" class="form-control" id="pwd" placeholder="SalvSolo1234" name="pswd" maxlength="20">
            </div>
            <button type="submit" class="btn btn-secondary">Aceptar</button>
            <input type="submit"class="btn btn-secondary"name="action" value="Volver" formaction="../MainController?action=Volver">
        </form>
        <br>
        <span>${NickMsg}</span>
        <span>${PassMsg}</span>
    </body>
</html>