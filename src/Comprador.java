import java.util.Random;

public class Comprador {

    private static Random random = new Random();
    private GerarNumeros numero = new GerarNumeros();
    private String nome;

    private double venda;

    public Comprador (String nome) {
        this.nome = nome;
    }

    public void comprar(Vendedor vendedor) {
        this.venda = random.nextInt(1000);
        vendedor.vendasRealizadas(venda);
    }

}
