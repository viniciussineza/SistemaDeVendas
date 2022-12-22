public class Vendedor {

    private String nome;
    private double valorVenda;
    private double bonificacao;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String anunciar() {
        String textoBonificacao = "";
        if (this.bonificacao > 0)
            textoBonificacao = " e fui bonificado " + bonificacao;
        return this.nome + " " + " e vendi " + this.valorVenda + " : total " + (this.valorVenda + this.bonificacao);
    }

    public void vendasRealizadas(double valor) {
        this.valorVenda += valor;
    }

    public void receberBonificao(double bonificacao) {
        this.bonificacao += bonificacao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public String getNome() { return this.nome; }

    @Override
    public String toString() {
        return "Vendedor(a) " + this.nome + " vendeu " + this.valorVenda;
    }
}
