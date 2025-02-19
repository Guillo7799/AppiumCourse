package ComparacionesNumericas;

import scanner.ScannerManager;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var numero = ScannerManager.leerInt(scanner, "Ingrese un numero: ");

        scanner.close();

        final var esPar = esPar(numero);
        final var esMultiplo5 = esMultiplo5(numero);
        imprimirResultado(numero, esPar, esMultiplo5);

    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static boolean esMultiplo5(int numero) {
        return numero % 5 == 0;
    }

    static void imprimirResultado(int numero, boolean esPar, boolean esMultiplo5) {
        System.out.printf("El número %d es par? %b%n ", numero, esPar);
        System.out.printf("El número %d es multiplo de 5? %b%n ", numero, esMultiplo5);
    }
}
