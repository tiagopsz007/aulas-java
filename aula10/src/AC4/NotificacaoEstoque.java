package AC4;

public class NotificacaoEstoque implements ObservadorPedido {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("ESTOQUE: " + mensagem);
    }
}
