package exemplo1;

public class NotificadorSMS implements Observador{
	@Override
	public void atualizar(String mensagem) {
		System.out.println("SMS: "+mensagem);
	}
}