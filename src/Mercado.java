public class Mercado {

    private String nomeMercado;
    private GerarNumeros numeros = new GerarNumeros();
    private Vendedor[] vendedores;
    private String localizacaoMercado;

    public Mercado(Vendedor[] vendedores, String nomeMercado) {
        this.vendedores = vendedores;
        this.nomeMercado = nomeMercado;
    }

    public void setLocalizacaoMercado(String localizacaoMercado) {
        this.localizacaoMercado = localizacaoMercado;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void negociacao(Mercado mercado, Comprador[] compradores) {

        int indice = 0;

        for (int i = 0; i < mercado.getVendedores().length; i++) {

            Vendedor vendedor = mercado.getVendedores()[i];
            indice = numeros.numeroAleatorio(compradores.length);
            Comprador comprador = compradores[indice];
            comprador.comprar( vendedor );

        }
    }
}
