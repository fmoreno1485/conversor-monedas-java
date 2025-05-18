package app;

import modelo.RespuestaApi;
import servicio.ApiExchangeRateService;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiExchangeRateService apiService = new ApiExchangeRateService();

        System.out.println("Sea bienvenido/a al Conversor de Moneda");

        int opcion;
        do {
            System.out.println("\n----- MENÚ PRINCIPAL -----");
            System.out.println("1. Convertir moneda");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la moneda base (ej. USD): ");
                    String monedaBase = scanner.nextLine().toUpperCase();

                    try {
                        RespuestaApi datos = apiService.obtenerDatosMoneda(monedaBase);
                        Map<String, Double> tasas = datos.getConversionRates();

                        System.out.print("Ingrese la moneda destino (ej. EUR): ");
                        String monedaDestino = scanner.nextLine().toUpperCase();

                        if (!tasas.containsKey(monedaDestino)) {
                            System.out.println("Moneda destino no encontrada.");
                            break;
                        }

                        System.out.print("Ingrese el monto a convertir: ");
                        double monto = scanner.nextDouble();
                        scanner.nextLine(); // limpiar buffer

                        double tasa = tasas.get(monedaDestino);
                        double resultado = monto * tasa;

                        System.out.printf("\n%.2f %s = %.2f %s\n", monto, monedaBase, resultado, monedaDestino);

                    } catch (IOException | InterruptedException e) {
                        System.out.println("Error al conectar con la API: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
