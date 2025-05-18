package web;

import modelo.RespuestaApi;
import servicio.ApiExchangeRateService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/conversor")
public class ConversorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String base = request.getParameter("base");
        String destino = request.getParameter("destino");
        double monto = Double.parseDouble(request.getParameter("monto"));

        ApiExchangeRateService servicio = new ApiExchangeRateService();
        try {
            RespuestaApi datos = servicio.obtenerDatosMoneda(base.toUpperCase());
            double tasa = datos.getConversionRates().get(destino.toUpperCase());
            double resultado = monto * tasa;

            request.setAttribute("resultado", String.format("%.2f", resultado));
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
        } catch (Exception e) {
            response.getWriter().println("Error al obtener datos de la API: " + e.getMessage());
        }
    }
}
