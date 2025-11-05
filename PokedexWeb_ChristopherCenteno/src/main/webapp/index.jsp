<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Pokedex Web - Registrar Pokémon</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Aquí luego enlazarás tu CSS -->
    <link rel="stylesheet" href="estilos/style.css"> 
</head>
<body>

    <h1>Registrar Nuevo Pokémon</h1>

    <form action="${pageContext.request.contextPath}/PokemonServlet" method="post">
        <label for="numero">Número:</label><br>
        <input type="number" id="numero" name="numero" required min="1"><br><br>

        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre" required><br><br>

        <label for="tipo">Tipo:</label><br>
        <select id="tipo" name="tipo" required>
            <option value="">-- Selecciona un tipo --</option>
            <option value="Fuego">Fuego</option>
            <option value="Agua">Agua</option>
            <option value="Planta">Planta</option>
            <option value="Eléctrico">Eléctrico</option>
            <option value="Normal">Normal</option>
            <option value="Roca">Roca</option>
            <option value="Veneno">Veneno</option>
            <option value="Psíquico">Psíquico</option>
            <option value="Hielo">Hielo</option>
            <option value="Lucha">Lucha</option>
            <option value="Dragón">Dragón</option>
            <option value="Hada">Hada</option>
            <option value="Siniestro">Siniestro</option>
        </select><br><br>

        <label for="urlImagen">URL de Imagen:</label><br>
        <input type="url" id="urlImagen" name="urlImagen" placeholder="https://..." required><br><br>

        <button type="submit">Agregar Pokémon</button>
    </form>

    <p><a href="${pageContext.request.contextPath}/PokemonServlet">Ver lista de Pokémon registrados</a></p>

</body>
</html>
