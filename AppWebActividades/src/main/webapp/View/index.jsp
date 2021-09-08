<%-- 
    Document   : index
    Created on : 06-sep-2021, 18:06:20
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="Página de inscripción a las actividades deportivas mas emocionantes">
        <meta name="author" content="Manuel Fernández & Agustín Rodríguez">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Página principal</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="CSS/main.css">

    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">     
            <a class="navbar-brand" href="MainController?action=Volver">IMD</a> 
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="MainController?action=Registro">Registro</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="MainController?action=Login">Iniciar sesión</a>
                </li>          
            </ul>
        </nav>
        <header>
            <h3>En IMD contamos con las actividades<br> que más se ajustan a tu perfil:</h3>
        </header>
        <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Busca una actividad..." title="Type in a name">
        <ul id="myUL">
            <li><a href="#">Adele</a></li>
            <li><a href="#">Agnes</a></li>

            <li><a href="#">Billy</a></li>
            <li><a href="#">Bob</a></li>

            <li><a href="#">Calvin</a></li>
            <li><a href="#">Christina</a></li>
            <li><a href="#">Cindy</a></li>
        </ul>
        <aside>
            <p>Publicidad</p>
        </aside>
        <footer>
            &copy;2021-2022 IMD S.A.Todos los derechos reservados.
        </footer>

    </body>
</html>
