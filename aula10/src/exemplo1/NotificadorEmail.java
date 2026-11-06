package exemplo1;

public class NotificadorEmail implements Observador{
	@Override
	public void atualizar(String mensagem) {
		System.out.println("Email: "+mensagem);
	}
}
