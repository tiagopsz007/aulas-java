package AC4;

public class NotificacaoCliente implements ObservadorPedido {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("CLIENTE: " + mensagem);
    }
}
