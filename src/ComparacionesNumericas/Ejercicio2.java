package ComparacionesNumericas;

import scanner.ScannerManager;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var a = ScannerManager.leerInt(scanner, "Ingrese un numero: ");
        final var b = ScannerManager.leerInt(scanner, "Ingrese un numero: ");

        scanner.close();

        final var esIgual = sonIguales(a, b);
        imprimirResultado(a, b, esIgual);

    }

    static boolean sonIguales(int a, int b) {
        return a == b;
    }

    static void imprimirResultado(int a, int b, boolean sonIguales) {
        System.out.printf("El numero %d es igual a %d? %b%n", a, b, sonIguales);
    }
}
