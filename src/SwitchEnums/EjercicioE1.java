package SwitchEnums;

import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioE1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var diaSemana = ScannerManager.leerString(scanner, "Ingrese el día de la semana: ");
        scanner.close();

        final var resultado = calcularKCal(DiaSemana.valueOf(diaSemana));
        imprimirResultado(diaSemana, resultado);

    }

    static int calcularKCal(DiaSemana diaSemana) {
        return switch (diaSemana) {
            case LUNES -> 350;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 100;
        };
    }

    static void imprimirResultado(String dia, int resultado) {
        System.out.printf("Para el día %s se tiene que quemar %dKCal", dia, resultado);
    }

    enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}
