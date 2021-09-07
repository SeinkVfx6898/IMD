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
    </head>
    <body>
        <main>
            <h1>SPORT LIFE STYLE</h1>
            <h2>¡Accede a tu cuenta para ver todas las actividades!</h2>
            <h3>--Rellena los campos--</h3>
            <form action="MainController" method="POST">
                <label>Email:</label>
                <input type="email"name="email"placeholder="Example@hotmail.com"required>
                <label>Contraseña</label>
                <input type="password"name="pass"placeholder="Example1234"required>
                <input type="submit"name="action"value="Aceptar">
                <input type="reset"name="action"value="Limpiar">
                <a href="../MainController?action=Volver">Volver</a>

            </form>
        </main>
    </body>
</html>
