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
    </head>
    <body>
        <h2>IMD</h2>
        <h3>Cada día númerosos grupos de personas disfruta con nuestras actividades<br></h3>
        ¡Disfruta tu también!.
        
        <form action="MainController">
            <label>Nick:</label>
            <input type="text"name="nick"placeholder="SalvSolo"required>
            <label>Email:</label>
            <input type="email"name="email"placeholder="sgzurita@gmail.com"required>
            <label>Contraseña</label>
            <input type="tel"name="tlf"placeholder="+34744639203"required>
            <input type="submit"name="action"value="Siguiente">
            <a href="../MainController?action=Volver">Volver</a>
        </form>
    </body>
</html>
