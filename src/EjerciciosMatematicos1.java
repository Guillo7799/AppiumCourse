public class EjerciciosMatematicos1 {
    public static void main(String[] args) {
        final var velocidadInicial = 15.24;
        final var aceleracion = 3.75;
        final var tiempo = 5;

        final var velocidadFinal = velocidadInicial + aceleracion * tiempo; //MRUV
        System.out.printf("Para una velocidad inicial %.3f, una aceleracion %.3f y un tiempo %d se tiene una velocidad final de %.3f", velocidadInicial, aceleracion, tiempo, velocidadFinal);
        System.out.printf("");
    }
}
