<%-- 
    Document   : registro2
    Created on : 07-sep-2021, 16:34:33
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../CSS/main.css">
    </head>
    <body>
        <div class="container">
            <h3>Cada día numerosos grupos de personas disfrutan de nuestras actividades.<br>
                ¡Forma parte de nosotros para disfrutar también!</h3>
            <form action="MainController?action=DatosLogin">
                <div class="form-group">
                    <label for="text">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" placeholder="Salvador" name="nombre" maxlength="30">
                </div>
                <div class="form-group">
                    <label for="text">Apellido:</label>
                    <input type="text" class="form-control" id="apellido" placeholder="González" name="apellido" maxlength="30">
                </div>
                <div class="form-group">
                    <label for="tlf">Teléfono:</label>
                    <input type="tlf" class="form-control" id="tlf" placeholder="+34744629902"pattern="[0-9]{9}" name="tlf">
                </div>
                <button type="submit" class="btn btn-secondary">Siguiente</button>
                <input type="submit"class="btn btn-secondary"name="action" value="Volver" formaction="../MainController?action=Volver">
            </form>
    </body>
</html>
