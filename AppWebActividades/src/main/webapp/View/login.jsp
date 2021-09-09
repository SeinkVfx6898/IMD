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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="../CSS/main.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    </head>
    <body>
        <h3>Accede a tu cuenta:</h3>
        <form action="MainController?action=postLogin">
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
    </body>
</html>