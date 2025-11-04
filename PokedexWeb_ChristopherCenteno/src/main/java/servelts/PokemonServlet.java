/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servelts;

import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import modelo.Pokemon;

/**
 *
 * @author chris
 */
@WebServlet(name = "PokemonServlet", urlPatterns = {"/PokemonServlet"})
public class PokemonServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // Crear lista global al iniciar la aplicación
        ServletContext context = getServletContext();
        if (context.getAttribute("listaPokemones") == null) {
            context.setAttribute("listaPokemones", new ArrayList<Pokemon>());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Pokemon> lista = (List<Pokemon>) getServletContext().getAttribute("listaPokemones");
        request.setAttribute("listaPokemones", lista);

        // Mostrar la tabla
        request.getRequestDispatcher("listaPokemones.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Leer parámetros del formulario
        String numeroStr = request.getParameter("numero");
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");
        String urlImagen = request.getParameter("urlImagen");

        int numero = 0;
        try {
            numero = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            numero = 0;
        }

        // 2. Crear objeto Pokemon
        Pokemon p = new Pokemon(numero, nombre, tipo, urlImagen);

        // 3. Recuperar/crear la lista en el contexto de la aplicación
        ServletContext context = getServletContext();
        List<Pokemon> lista = (List<Pokemon>) context.getAttribute("listaPokemones");
        if (lista == null) {
            lista = new ArrayList<>();
        }
        lista.add(p);

        // 4. Guardar la lista de vuelta en el contexto
        context.setAttribute("listaPokemones", lista);

        // 5. Redirigir al servlet que muestra la tabla
        response.sendRedirect(request.getContextPath() + "/listPokemon");
    }

}
