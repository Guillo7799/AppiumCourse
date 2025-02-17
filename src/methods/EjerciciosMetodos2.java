package methods;

import java.util.Random;

public class EjerciciosMetodos2 {
    public static void main(String[] args) {
        final var random = new Random();
        final var aceleracion = RandomUtilities.generarRandomDouble(2, 5, random);
        final var tiempo = RandomUtilities.generarRandomInt(3, 5, random);
        final var velocidadInicial = RandomUtilities.generarRandomDouble(10, 30, random);

        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
        imprimirResultado(velocidadFinal, velocidadInicial, aceleracion, tiempo);
    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + aceleracion * tiempo;
    }

    static void imprimirResultado(double velocidadFinal, double velocidadInicial, double aceleracion, int tiempo) {
        System.out.printf("Para una velocidad inicial %.3f, una aceleracion %.3f y un tiempo %d. Se tiene una velocidad final " +
                "%.3f usando MRUV", velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
