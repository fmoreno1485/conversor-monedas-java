<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Conversor de Monedas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4 text-center">Conversor de Monedas</h2>
    <form action="conversor" method="post">
        <div class="mb-3">
            <label for="base" class="form-label">Moneda Base (ej: USD)</label>
            <input type="text" class="form-control" id="base" name="base" required>
        </div>
        <div class="mb-3">
            <label for="destino" class="form-label">Moneda Destino (ej: EUR)</label>
            <input type="text" class="form-control" id="destino" name="destino" required>
        </div>
        <div class="mb-3">
            <label for="monto" class="form-label">Monto a Convertir</label>
            <input type="number" step="0.01" class="form-control" id="monto" name="monto" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Convertir</button>
    </form>
</div>
</body>
</html>

