public class Regulador {

    public void aplicar(Mercado[] mercados) {

        for (int i = 0; i < mercados.length; i++) {
            Mercado mercado = mercados[i];
            Vendedor[] vendedores = mercado.getVendedores();
            for (int j = 0; j < vendedores.length; j++) {
                Vendedor vendedor = vendedores[j];
                if( superioMeta(vendedor) ) {
                    this.bonificar( vendedor );
                }
            }
        }
    }

    private boolean superioMeta(Vendedor vendedor) {
        return vendedor.getValorVenda() > 500;
    }

    private void bonificar(Vendedor vendedor) {
        double total = vendedor.getValorVenda();
        double bonificacao = (total * 0.10);
        vendedor.receberBonificao(bonificacao);
    }

}
