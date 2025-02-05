import java.util.Random;

public class EjerciciosMatematicos4 {
    public static void main(String[] args) {
        final var max = 100;
        final var min = 20;
        final var random = new Random();
        final var radio = random.nextInt(max - min + 1) + min;

        final var areaCirculo = Math.PI * Math.pow(radio, 2);
        final var perimetroCirculo = 2 * Math.PI * radio;

        System.out.printf("Para un radio %d el área del circulo es %.3f y el perímetro es %.3f ", radio, areaCirculo, perimetroCirculo);
    }
}
