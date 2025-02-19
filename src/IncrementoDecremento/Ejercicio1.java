package IncrementoDecremento;

import methods.RandomUtilities;
import scanner.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        var numero = ScannerManager.leerInt(scanner, "Ingrese un número: ");


        scanner.close();

        numero++;

        System.out.printf("El numero es: %d%n", numero);

        final var n = RandomUtilities.generarRandomInt(3, 10, new Random());
        System.out.printf("El valor aleatorio es: %d%n", n);
        //incrementamos en n
        numero += n;
        System.out.printf("El numero es: %d%n", numero);
    }
}
