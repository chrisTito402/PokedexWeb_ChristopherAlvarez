<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Pokedex Web - Lista de Pokémon</title>
        <link rel="stylesheet" href="estilos/style.css"> 
    </head>
    <body>
        <div>
            <h1>Pokémon Registrados</h1>
            <table border="1" cellspacing="0" cellpadding="8">
                <thead>
                    <tr>
                        <th>Número</th>
                        <th>Nombre</th>
                        <th>Tipo</th>
                        <th>Imagen</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="p" items="${listaPokemones}">
                        <tr>
                            <td>${p.numero}</td>
                            <td>${p.nombre}</td>
                            <td>${p.tipo}</td>
                            <td>
                                <img src="${p.imagenUrl}" alt="${p.nombre}" width="80">
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <p>
                <a href="index.jsp">← Volver al registro</a>
            </p>
        </div>

    </body>
</html>
