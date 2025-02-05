public class EjerciciosMatematicos2 {
    public static void main(String[] args) {
        final var aceleracion = 100.5032;
        final var masa = 76.1265;

        final var fuerza = masa * aceleracion;
        System.out.printf("Para una masa %.4f y una aceleracion %.4f se tiene una fuerza de %.4f%n", masa, aceleracion, fuerza);
    }
}
