package servicio;

import com.google.gson.Gson;
import modelo.RespuestaApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiExchangeRateService {

    private final String apiKey = "6a1b5c7497862443790cd21d";
    private final HttpClient client;

    public ApiExchangeRateService() {
        this.client = HttpClient.newHttpClient();
    }

    public RespuestaApi obtenerDatosMoneda(String monedaBase) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaBase;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Error al obtener datos: Código HTTP " + response.statusCode());
        }

        Gson gson = new Gson();
        return gson.fromJson(response.body(), RespuestaApi.class);
    }
}
