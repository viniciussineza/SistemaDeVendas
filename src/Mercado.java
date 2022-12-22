public class Mercado {

    private String nomeMercado;
    private GerarNumeros numeros = new GerarNumeros();
    private Vendedor[] vendedores;
    private String localizacaoMercado;
    private double totalVendas;

    public Mercado(Vendedor[] vendedores, String nomeMercado) {
        this.vendedores = vendedores;
        this.nomeMercado = nomeMercado;
    }

    public String getNomeMercado() { return this.nomeMercado; }
    public void setLocalizacaoMercado(String localizacaoMercado) {
        this.localizacaoMercado = localizacaoMercado;
    }
    public String getLocalizacaoMercado() { return this.localizacaoMercado; }
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

    public String imprimirMercado(Mercado mercado) {
        String nomeMercado = mercado.getNomeMercado();
        String localMercado = mercado.getLocalizacaoMercado();
        double totalVendas = totalVendas(mercado);
        return "\n" +
                "Mercado: " + nomeMercado +
                "\n" +
                "Local: " + localMercado +
                "\n" +
                "Total de Vendas " + totalVendas +
                "\n" +
                "#########################################";
    }

    public String[] ranking(Mercado mercado) {
        double valorVenda;
        String[] ranking = new String[mercado.getVendedores().length];
        for (int i = 0; i < mercado.getVendedores().length; i++) {

            Vendedor vendedor = mercado.getVendedores()[i];
            valorVenda = vendedor.getValorVenda();

            for (int j = 0; j < mercado.getVendedores().length; j++) {

                vendedor = mercado.getVendedores()[j];

                if ( valorVenda > vendedor.getValorVenda()) {
                    ranking[i] = "Vendedor(a) " + vendedor.getNome() + " vendeu " + Double.toString(valorVenda);
                }
            }
        }

        return ranking;
    }

    private double totalVendas(Mercado mercado) {

        for (int i = 0; i < mercado.getVendedores().length; i++) {

            Vendedor vendedor = mercado.getVendedores()[i];

            this.totalVendas += vendedor.getValorVenda();
        }

        return totalVendas;
    }


    // TODO Criação do ranking de vendedores

    // TODO Criação do ranking de compradore

    // TODO como calcular o mercado mais lucrativo ( soma das vendas do mercado e comparando)

    // TODO Apresentação { Nome Mercado - Local - Vendedores { top 3 } }

}
