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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link href="../CSS/main.css" rel="stylesheet" type="text/css">
        
    </head>
    <body>
        <header>
            <h2>Crea tu cuenta</h2>
            <p>Cada día númerosos grupos de personas disfrutan<br> de nuestras actividades.
                ¡Unete a nosotros y prueba!.
            </p>
        </header>
        <form action="MainController" method="GET">
            <label>Nombre:</label>
            <input type="text"name="apellido"placeholder="Salvador"required>
            <label>Contraseña:</label>
            <input type="text"name="apellido"placeholder="González"required>
            <label>Teléfono:</label>
            <input type="text"name="tlf"placeholder="+34743629805"required>          
            <input type="submit"name="action"value="Siguiente">
            <input type="submit"name="action"value="Volver">
        </form>

    </body>
</html>
