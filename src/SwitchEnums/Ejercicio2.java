package SwitchEnums;

import scanner.ScannerManager;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var dia = ScannerManager.leerString(scanner, "Ingrese el día de la semana: ");
        scanner.close();

        final var resultado = calcularKCal(dia);
        imprimirResultado(dia, resultado);

    }

    static int calcularKCal(String dia) {
        return switch (dia) {
            case "Lunes", "lunes" -> 350;
            case "Martes", "martes" -> 420;
            case "Miercoles", "miercoles" -> 220;
            case "Jueves", "jueves" -> 600;
            case "Viernes", "viernes" -> 125;
            case "Sabado", "sabado" -> 250;
            case "Domingo", "domingo" -> 100;
            default -> -1;
        };
    }

    static void imprimirResultado(String dia, int resultado) {
        System.out.printf("Para el día %s se tiene que quemar %d", dia, resultado);
    }
}
