package CondicionalIfElse;

import scanner.ScannerManager;

import java.util.Scanner;

public class EjercicioCirculo {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var radio = ScannerManager.leerDouble(scanner, "Ingrese el radio: ");
        imprimirMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Ingrese la opcion: ");

        scanner.close();

        if (validarInput(opcion)) {
            if (opcion == 'A') {
                mostrarArea(calcularArea(radio));
            } else if (opcion == 'B') {
                mostrarPerimetro(calcularPerimetro(radio));
            } else if (opcion == 'C') {
                mostrarArea(calcularArea(radio));
                mostrarPerimetro(calcularPerimetro(radio));
            }
        } else {
            System.out.println("Opcion Incorrecta");
        }
    }

    static void imprimirMenu() {
        System.out.printf("A. Calcular el área%n" +
                "B. Calcular el perímetro%n" +
                "C. Calcular ambos%n");
    }

    static boolean validarInput(char opcion) {
        return (opcion == 'A') || (opcion == 'B') || (opcion == 'C');
    }

    static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    static void mostrarArea(double area) {
        System.out.printf("El area es %.2f%n", area);
    }

    static void mostrarPerimetro(double perimetro) {
        System.out.printf("El perimetro es %.2f%n", perimetro);
    }
}
