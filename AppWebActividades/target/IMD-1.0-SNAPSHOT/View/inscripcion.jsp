<%-- 
    Document   : inscripcion
    Created on : 09-sep-2021, 18:05:34
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%@include file = "../JSPF/meta.jspf"%>
        <title>Inscripción</title>
    
        
    </head>
    <body>
       <h3>${actividad.getNombre()}</h3>
       <p>${actividad.getDescripcion()}</p>
       <p>${actividad.getPrecio()}&#8364;</p>
    </body>
</html>
