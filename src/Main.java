public class Main {

    private static GerarNumeros gerarVenda = new GerarNumeros();
    private static  GerarNomes gerarNomes = new GerarNomes();

    public static void main(String[] args) {

        System.out.println("Bem vindo ao Financeiro Ba'mal kul juhdi");

        String[] nomesVendedoresEspeciarias = gerarNomes.nomesVendedoresGerados();
        String[] nomesVendedoresTecidos = gerarNomes.nomesVendedoresGerados();;
        String[] nomesVendedoresCamelos = gerarNomes.nomesVendedoresGerados();;
        String[] nomesCompradores = gerarNomes.nomesVendedoresGerados();


        // int[] vendas = gerarVenda.gerarVendas(nomesVendedoresEspeciarias.length); // TODO criar método compras e passar as vendas para cada vendedor

        String localEspeciarias = "Marrocos";
        String localTecidos = "Egito";
        String localCamelos = "Arabia";

        String nomeMercadoEspeciarias = "Mercado de Especiarias Zattar";
        String nomeMercadoTecidos = "Mercado de Tecidos Qumash"; // Qumash == pano
        String nomeMercadoCamelos = "Mercado de Camelos Jamal"; // Jamal == Camelo

        Vendedor[] vendedoresEspeciarias = new Vendedor[nomesVendedoresEspeciarias.length];

        for (int i = 0; i < nomesVendedoresEspeciarias.length; i++) {
            vendedoresEspeciarias[i] = new Vendedor(nomesVendedoresEspeciarias[i]);
        }

        System.out.println("##################### VENDEDORES ESPECIARIAS #####################");
        for (int i = 0; i < vendedoresEspeciarias.length; i++) {
            System.out.println(vendedoresEspeciarias[i]);
        }

        Vendedor[] vendedoresTecidos = new Vendedor[nomesVendedoresTecidos.length];

        for (int i = 0; i < nomesVendedoresTecidos.length; i++) {
            vendedoresTecidos[i] = new Vendedor(nomesVendedoresTecidos[i]);
        }

        System.out.println("##################### VENDEDORES TECIDOS #####################");
        for (int i = 0; i < vendedoresTecidos.length; i++) {
            System.out.println(vendedoresTecidos[i]);
        }

        Vendedor[] vendedoresCamelos = new Vendedor[nomesVendedoresCamelos.length];

        for (int i = 0; i < vendedoresCamelos.length; i++) {
            vendedoresCamelos[i] = new Vendedor(nomesVendedoresCamelos[i]);
        }

        System.out.println("##################### VENDEDORES CAMELOS #####################");
        for (int i = 0; i < vendedoresCamelos.length; i++) {
            System.out.println(vendedoresCamelos[i]);
        }

        Mercado mercadoEspeciarias = new Mercado(vendedoresEspeciarias, nomeMercadoEspeciarias);
        Mercado mercadoTecidos = new Mercado(vendedoresTecidos, nomeMercadoTecidos);
        Mercado mercadoCamelos = new Mercado(vendedoresCamelos, nomeMercadoCamelos);

        mercadoEspeciarias.setLocalizacaoMercado(localEspeciarias);
        mercadoTecidos.setLocalizacaoMercado(localTecidos);
        mercadoCamelos.setLocalizacaoMercado(localCamelos);

        Comprador[] compradores = new Comprador[nomesCompradores.length];

        for (int i = 0; i < compradores.length; i++) {
            compradores[i] = new Comprador(nomesCompradores[i]);
        }

        mercadoEspeciarias.negociacao(mercadoEspeciarias, compradores);
        mercadoTecidos.negociacao(mercadoTecidos, compradores);
        mercadoCamelos.negociacao(mercadoCamelos, compradores);

        //TODO Apresentação e Ranking



    }

}