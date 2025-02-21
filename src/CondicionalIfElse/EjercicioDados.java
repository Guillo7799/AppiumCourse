package CondicionalIfElse;

import methods.RandomUtilities;
import scanner.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class EjercicioDados {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var numeroJugador = ScannerManager.leerInt(scanner, "Ingresa un numero entre 1 y 6: ");

        scanner.close();

        if (validarNumero(numeroJugador)) {
            final var numeroAleatorio = RandomUtilities.generarRandomInt(1, 6, new Random());
            mostrarMensajeGanador(numeroJugador, numeroAleatorio);
        } else {
            System.out.println("Numero no valido, intente de nuevo");
        }
    }

    static boolean validarNumero(int numeroJugador) {
        return (numeroJugador >= 1) && (numeroJugador <= 6);
    }

    static void mostrarMensajeGanador(int numeroJugador, int numeroAleatorio) {
        System.out.printf("El numero aleatorio es: %d%n", numeroAleatorio);

        if (numeroJugador == numeroAleatorio) {
            System.out.println("Ganaste!!");
        } else {
            System.out.println("Perdiste!!");
        }
    }
}
