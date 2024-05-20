package com.aluradesafio.conversorDeMonedas.Principal;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solicitud {
    double nuevaConversion;
    public Conversion realizaConversion (String base_code, String target_code, double monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/93dc2ee851ba3296191e05be/pair/"
                + base_code + "/" + target_code + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al hacer la conversión");
        }
    }
    public void resultadoFinal(String base_code, String target_code, double monto){
        Solicitud miSolicitud = new Solicitud();
        nuevaConversion = miSolicitud.realizaConversion(base_code, target_code, monto).conversion_result();
        System.out.println("El valor de $" + monto + " [" + base_code + "] " +"es equivalente al valor de $" + nuevaConversion
                + " [" + target_code + "]");
    }

}
