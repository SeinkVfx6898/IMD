<%-- 
    Document   : registropart2
    Created on : 7 sept. 2021, 10:30:12
    Author     : usuar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <header>
            <h2>Crea tu cuenta</h2>
            <p>Cada día númerosos grupos de personas disfrutan<br> de nuestras actividades.
                ¡Unete a nosotros y prueba!.
            </p>
        </header>
        <form action="MainController">
            <label>Nick:</label>
            <input type="text"name="nick"placeholder="SalvSolo"required>
            <label>Email:</label>
            <input type="email"name="email"placeholder="sgzurita@gmail.com"required>
            <label>Contraseña:</label>
            <input type="password"name="pass"placeholder="SalvSolo1234"required> 
            <label>Confirmar contraseña:</label>
            <input type="password"name="confirmpass"placeholder="SalvSolo1234"required>     
            <input type="submit"name="action"value="Siguiente">
            <input type="submit"name="action"value="Volver">
        </form>
    </body>
</html>
