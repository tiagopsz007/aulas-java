package exemplo1;

public class Main {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		Observador email = new NotificadorEmail();
		Observador sms = new NotificadorSMS();

		pedido.AdicionarObservador(email);
		pedido.AdicionarObservador(sms);
		
		pedido.confirmarPedido();
		
		
	}

}
