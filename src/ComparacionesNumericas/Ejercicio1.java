package ComparacionesNumericas;

import methods.RandomUtilities;

import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        //final var random = new Random();
        final var a = RandomUtilities.generarRandomInt(20, 100, new Random());
        final var b = RandomUtilities.generarRandomInt(20, 100, new Random());

        final var aEsNegativo = esNegativo(a);
        final var bEsNegativo = esNegativo(b);

        imprimirResultado(a, aEsNegativo);
        imprimirResultado(b, bEsNegativo);
    }

    static boolean esNegativo(int numero) {
        return numero < 0;
    }

    static void imprimirResultado(int numero, boolean esNegativo) {
        System.out.printf("El numero %d es negativo? %b%n", numero, esNegativo);
    }
}
