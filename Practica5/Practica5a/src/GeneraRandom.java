import java.util.Random;

public class GeneraRandom {

    public static final int MAXIMO_VALOR = 53;

    public static int obtenerRandom() {
        return MAXIMO_VALOR * (((long) Random.next(26) << 27) + Random.next(27)) / (double) (1L << 53);
    }
}
