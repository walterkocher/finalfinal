<%--
  Created by IntelliJ IDEA.
  User: walter
  Date: 30-05-2023
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro usuario</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
<h1 class="encabezado"> Registro usuarios</h1>
<h2 class="subtitulo">Datos Incorrectos, favor comprobar nuevamente</h2>
<form action="registroUsuario" method="post">
    <div class="centrado">
        <label> Nombre: </label>
        <input name="nombre" type="text" class="campoTexto">
        <label> Edad:</label>
        <input name="edad" type="number" class="campoTexto">
        <br><br>
        <input class="boton" type="submit" value= "enviar">
    </div>
</form>
</body>
</html>