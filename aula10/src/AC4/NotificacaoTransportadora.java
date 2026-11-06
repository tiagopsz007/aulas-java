package AC4;

public class NotificacaoTransportadora implements ObservadorPedido {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("TRANSPORTADORA: " + mensagem);
    }
}