<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String base = request.getParameter("base");
    String destino = request.getParameter("destino");
    String monto = request.getParameter("monto");
    String resultado = request.getAttribute("resultado").toString();
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5 text-center">
    <h2>Resultado de la Conversión</h2>
    <p class="fs-4">
        <strong><%= monto %> <%= base %> = <%= resultado %> <%= destino %></strong>
    </p>
    <a href="index.jsp" class="btn btn-secondary mt-3">Volver</a>
</div>
</body>
</html>
