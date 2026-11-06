package AC4;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 150.00, 2);
        Produto p2 = new Produto("Mouse", 80.00, 1);
        Produto p3 = new Produto("Monitor", 900.00, 1);

        Pedido pedido = new Pedido.Builder("Carlos")
                .adicionarProduto(p1)
                .adicionarProduto(p2)
                .adicionarProduto(p3)
                .enderecoEntrega("Rua das Flores, 100")
                .entregaExpressa(true)
                .observacoes("Entregar pela manhã")
                .build();

        System.out.println("===== SISTEMA DE PEDIDOS =====");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Produtos:");
        for (Produto p : pedido.getProdutos()) {
            String unidadeStr = p.getQuantidade() > 1 ? "unidades" : "unidade";
            System.out.printf( "%s - %d %s - R$ %.2f%n",
                    p.getNome(), p.getQuantidade(), unidadeStr, p.calcularSubtotal());
        }
        System.out.printf("Total: R$ %.2f%n", pedido.calcularTotal());

        PagamentoLegado legado = new PagamentoLegado();
        Pagamento pagamentoAdapter = new PagamentoAdapter(legado);

        ProcessadorPedido processador = new ProcessadorPedido(pagamentoAdapter);
        processador.adicionarObservador(new NotificacaoCliente());
        processador.adicionarObservador(new NotificacaoEstoque());
        processador.adicionarObservador(new NotificacaoTransportadora());

        System.out.println("\n=== PROCESSAMENTO ===");

        processador.processar(pedido);

        System.out.println("Pedido finalizado com sucesso!");
    }
}