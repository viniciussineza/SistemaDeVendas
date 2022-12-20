import java.util.Random;

public class Comprador {

    private GerarNumeros numero = new GerarNumeros();
    private String nome;

    private int venda;

    public Comprador (String nome) {
        this.nome = nome;
    }

    public void comprar(Vendedor vendedor) {
        this.venda = numero.numeroAleatorio(1);
        vendedor.vendasRealizadas(venda);
    }

}
