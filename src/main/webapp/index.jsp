<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Calculadora</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #1c1c1c; color: #fff; text-align: center; padding: 50px; }
        .container { max-width: 400px; margin: auto; background: #333; padding: 20px; border-radius: 8px; }
        input, select, button { width: 100%; padding: 10px; margin: 10px 0; border: none; border-radius: 4px; }
        button { background-color: #00aaff; color: #fff; cursor: pointer; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Calculadora</h1>
        <form action="Calcular" method="post">
            <input type="number" name="numero1" placeholder="Número 1" required>
            <input type="number" name="numero2" placeholder="Número 2" required>
            <select name="operacion" required>
                <option value="suma">Suma</option>
                <option value="resta">Resta</option>
                <option value="multiplicacion">Multiplicación</option>
                <option value="division">División</option>
                <option value="ordenar">Ordenar</option>
                <option value="parImpar">Par o Impar</option>
            </select>
            <button type="submit">Calcular</button>
        </form>
    </div>
</body>
</html>
