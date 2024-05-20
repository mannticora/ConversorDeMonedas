package com.aluradesafio.conversorDeMonedas.Principal;

import com.aluradesafio.conversorDeMonedas.Principal.Solicitud;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Solicitud solicitud = new Solicitud();
        Scanner teclado = new Scanner(System.in);
        String base_code;
        String target_code;
        Solicitud miSolicitud = new Solicitud();
        int opcionMenu;
        double monto;

        do {
            System.out.println("""
                    *********************************
                    Bienvenida/o al conversor de Monedas
                    Seleccione una opción:
                    
                    1) Dólar [USD] a Peso Mexicano [MXN]
                    2) Peso Mexicano [MXN] a Dólar [USD]
                    3) Dólar [USD] a Peso Colombiano [COP]
                    4) Peso Colombiano [COP] a Dólar [USD]
                    5) Dólar [USD] a Peso Argentino [ARS]
                    6) Peso Argentino [ARS] a Dólar [USD]
                    7) Dólar [USD] a Real Brasileño [BRL]
                    8) Real Brasileño [BRL] a Dólar [USD]
                    9) Salir
                    """);
            try {
                opcionMenu = teclado.nextInt();

                switch (opcionMenu) {
                    case 1:
                        System.out.println("Ingrese cantidad en USD para convertir a MXN: ");
                        monto = teclado.nextDouble();
                        base_code = "USD";
                        target_code = "MXN";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 2:
                        System.out.println("Ingrese cantidad en [MXN] para convertir a [USD]: ");
                        monto = teclado.nextDouble();
                        base_code = "MXN";
                        target_code = "USD";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 3:
                        System.out.println("Ingrese cantidad en [USD] para convertir a [COP]: ");
                        monto = teclado.nextDouble();
                        base_code = "USD";
                        target_code = "COP";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 4:
                        System.out.println("Ingrese cantidad en [COP] para convertir a [USD]: ");
                        monto = teclado.nextDouble();
                        base_code = "COP";
                        target_code = "USD";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 5:
                        System.out.println("Ingrese cantidad en [USD] para convertir a [ARS]: ");
                        monto = teclado.nextDouble();
                        base_code = "USD";
                        target_code = "ARS";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 6:
                        System.out.println("Ingrese cantidad en [ARS] para convertir a [USD]: ");
                        monto = teclado.nextDouble();
                        base_code = "ARS";
                        target_code = "USD";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 7:
                        System.out.println("Ingrese cantidad en [USD] para convertir a [BRL]: ");
                        monto = teclado.nextDouble();
                        base_code = "USD";
                        target_code = "BRL";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 8:
                        System.out.println("Ingrese cantidad en [BRL] para convertir a [USD]: ");
                        monto = teclado.nextDouble();
                        base_code = "BRL";
                        target_code = "USD";
                        miSolicitud.resultadoFinal(base_code, target_code, monto);
                        break;

                    case 9:
                        System.out.println("Finalizada la ejecución");
                        break;

                    default:
                        System.out.println("Opción no válida, por favor seleccione una opción del 1 al 9.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                teclado.next();
                opcionMenu = 0;
            }
        } while (opcionMenu != 9);

        teclado.close();
    }
}
