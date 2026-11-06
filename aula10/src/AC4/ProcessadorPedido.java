package AC4;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorPedido {
    private Pagamento pagamento;
    private List<ObservadorPedido> observadores = new ArrayList<>();

    public ProcessadorPedido(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void adicionarObservador(ObservadorPedido observador) {
        this.observadores.add(observador);
    }

    public void processar(Pedido pedido) {
        double total = pedido.calcularTotal();
        
        pagamento.pagar(total);
        System.out.println("Pagamento processado!");
        System.out.println("\n=== NOTIFICAÇÕES ===");
        notificarTodos();
    }

    private void notificarTodos() {

        for (ObservadorPedido obs : observadores) {

            if (obs instanceof NotificacaoCliente) {

                obs.atualizar("Seu pedido foi confirmado.\n");

            } else if (obs instanceof NotificacaoEstoque) {

                obs.atualizar("Separar os produtos do pedido.\n");

            } else if (obs instanceof NotificacaoTransportadora) {

                obs.atualizar("Preparar a entrega.\n");

            }

        }

    }
}
