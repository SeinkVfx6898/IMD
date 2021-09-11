<%-- 
    Document   : registro2
    Created on : 07-sep-2021, 16:34:33
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "../JSPF/meta.jspf"%>
        <title>Registro</title>
        <%@include file = "../JSPF/datospersonales.jspf"%>
    </head>
    <body>
        <div class="container">
            <h3>Cada día numerosos grupos de personas disfrutan de nuestras actividades.<br>
                ¡Forma parte de nosotros para disfrutar también!</h3>
            <form action="../MainController?action=Continuar">
                <div class="form-group">
                    <label for="text">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" placeholder="Salvador" name="nombre" maxlength="30"required>
                </div>
                <div class="form-group">
                    <label for="text">Apellido:</label>
                    <input type="text" class="form-control" id="apellido" placeholder="González" name="apellido" maxlength="30"required>
                </div>
                <div class="form-group">
                    <label for="tlf">Teléfono:</label>
                    <input type="tlf" class="form-control" id="tlf" placeholder="+34744629902"pattern="[0-9]{9}" name="tlf"required>
                </div>
                <input type="submit" class="btn btn-secondary"name="action"value="Continuar">
                <input type="reset"class="btn btn-secondary"name="action"value="Limpiar">
                <input type="submit"class="btn btn-secondary"name="action" value="Volver" formaction="../MainController?action=Volver">
            </form>
    </body>
</html>
