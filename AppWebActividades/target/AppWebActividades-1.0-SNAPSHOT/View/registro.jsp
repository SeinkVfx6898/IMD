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
    </head>
    <body>
        <h2>IMD</h2>
        <h3>Cada día númerosos grupos de personas disfruta con nuestras actividades<br></h3>
        ¡Disfruta tu también!.
        
        <form action="MainController">
            <label>Nombre:</label>
            <input type="text"name="nombre"placeholder="Salvador"required>
            <label>Apellido:</label>
            <input type="text"name="pass"placeholder="González"required>
            <label>Teléfono</label>
            <input type="tel"name="tlf"placeholder="+34744639203"required>
            <input type="submit"name="action"value="Siguiente">
            <a href="../MainController?action=Volver">Volver</a>
        </form>
    </body>
</html>
