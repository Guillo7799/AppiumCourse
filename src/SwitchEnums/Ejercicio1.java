package SwitchEnums;

import scanner.ScannerManager;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        imprimitMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Ingrese la opción: ");
        final var numero1 = ScannerManager.leerInt(scanner, "Ingrese el primer número: ");
        final var numero2 = ScannerManager.leerInt(scanner, "Ingrese el segundo número: ");

        scanner.close();

        ejecutarOpcion(numero1, numero2, opcion);
    }

    static void ejecutarOpcion(int numero1, int numero2, char opcion) {
        final var resultado = switch (opcion) {
            case 'A', 'a' -> calcularSuma(numero1, numero2);
            case 'B', 'b' -> calcularResta(numero1, numero2);
            case 'C', 'c' -> calcularMultiplicación(numero1, numero2);
            case 'D', 'd' -> calcularDivision(numero1, numero2);
            case 'E', 'e' -> calcularResto(numero1, numero2);
            default -> -1;
        };

        if (resultado != -1) {
            System.out.printf("El resultado entre los primero numeros %d & %d es %d%n", numero1, numero2, resultado);
        } else {
            System.out.println("Opción incorecta");
        }
    }

    static void imprimitMenu() {
        System.out.println("A/a: sumar");
        System.out.println("B/b: restar");
        System.out.println("C/c: multiplicar");
        System.out.println("D/d: dividir");
        System.out.println("E/e: resto");
    }

    static int calcularSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int calcularResta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    static int calcularMultiplicación(int numero1, int numero2) {
        return numero1 * numero2;
    }

    static int calcularDivision(int numero1, int numero2) {
        return numero1 / numero2;
    }

    static int calcularResto(int numero1, int numero2) {
        return numero1 | numero2;
    }
}
