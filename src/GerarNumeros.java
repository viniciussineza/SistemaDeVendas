import java.util.Random;

public class GerarNumeros {

    private static final Random random = new Random();

    public int numeroAleatorio(int tamanho) {
        return random.nextInt(tamanho);
    }
}
