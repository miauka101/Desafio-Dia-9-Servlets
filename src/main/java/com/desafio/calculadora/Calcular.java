package com.desafio.calculadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcular
 */
@WebServlet("/Calcular")
public class Calcular extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calcular() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario y convertirlos a enteros
            int numero1 = Integer.parseInt(request.getParameter("numero1"));
            int numero2 = Integer.parseInt(request.getParameter("numero2"));
            String operacion = request.getParameter("operacion");

            String resultado = "";

            // Procesar la operación seleccionada
            switch (operacion) {
                case "suma":
                    resultado = "Resultado: " + (numero1 + numero2);
                    break;
                case "resta":
                    resultado = "Resultado: " + (numero1 - numero2);
                    break;
                case "multiplicacion":
                    resultado = "Resultado: " + (numero1 * numero2);
                    break;
                case "division":
                    if (numero2 != 0) {
                        resultado = "Resultado: " + (numero1 / numero2);
                    } else {
                        resultado = "Error: División por cero.";
                    }
                    break;
                case "ordenar":
                    resultado = "Orden: " + Math.min(numero1, numero2) + ", " + Math.max(numero1, numero2);
                    break;
                case "parImpar":
                    resultado = "Número 1 es " + (numero1 % 2 == 0 ? "par" : "impar") + 
                                " y Número 2 es " + (numero2 % 2 == 0 ? "par" : "impar");
                    break;
                default:
                    resultado = "Operación no válida.";
                    break;
            }

            // Enviar el resultado a la respuesta del cliente
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("<html><body><h2>" + resultado + "</h2><a href='index.jsp'>Volver</a></body></html>");

        } catch (NumberFormatException e) {
            // Si los valores ingresados no son números, redirigir a una página de error
            response.sendRedirect("error.jsp");
        }
    }

    // Puedes eliminar el método doGet si no lo necesitas
}
