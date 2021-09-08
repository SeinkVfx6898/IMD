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
         <link rel="stylesheet" href="CSS/main.css">    
    </head>
    <body>
        <main>
            <h1>IMD</h1>
            <h2>¡Accede a tu cuenta para ver todas las actividades!</h2>
            <form action="MainController" method="POST">
                <label>Nick:</label>
                <input type="text"name="email"placeholder="Example@hotmail.com"required>
                <label>Contraseña</label>
                <input type="password"name="pass"placeholder="Example1234"required>
                <input type="submit" class="btn btn-dark"name="action"value="Aceptar">
                <input type="reset" class="btn btn-dark"name="action"value="Limpiar">
                <a href="http://localhost:8080/AppWebActividades/MainController?action=Volver">Volver</a>

            </form>
        </main>
    </body>
</html>
