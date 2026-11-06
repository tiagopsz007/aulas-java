package AC4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {
    private final String cliente;
    private final List<Produto> produtos;
    private final String enderecoEntrega;
    private final boolean entregaExpressa;
    private final String observacoes;

    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.produtos = Collections.unmodifiableList(new ArrayList<>(builder.produtos));
        this.enderecoEntrega = builder.enderecoEntrega;
        this.entregaExpressa = builder.entregaExpressa;
        this.observacoes = builder.observacoes;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public boolean isEntregaExpressa() {
        return entregaExpressa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.calcularSubtotal();
        }
        return total;
    }

    public static class Builder {
        private String cliente;
        private List<Produto> produtos = new ArrayList<>();
        private String enderecoEntrega;
        private boolean entregaExpressa = false;
        private String observacoes = "";       

        public Builder(String cliente) {
            this.cliente = cliente;
        }

        public Builder adicionarProduto(Produto produto) {
            this.produtos.add(produto);
            return this;
        }

        public Builder enderecoEntrega(String enderecoEntrega) {
            this.enderecoEntrega = enderecoEntrega;
            return this;
        }

        public Builder entregaExpressa(boolean entregaExpressa) {
            this.entregaExpressa = entregaExpressa;
            return this;
        }

        public Builder observacoes(String observacoes) {
            this.observacoes = observacoes;
            return this;
        }

        public Pedido build() {
            if (cliente == null || cliente.isBlank() || produtos.isEmpty() || enderecoEntrega == null || enderecoEntrega.isBlank()) {
                throw new IllegalStateException("Configuração do pedido inválida: cliente, endereço e ao menos um produto são obrigatórios.");
            }
            
            return new Pedido(this);
        }
    }
}