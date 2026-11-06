package DIP;

public class Main {
	public static void main(String[] args) {
		Notificador email = new EmailNotificador();
		Notificador sms = new EmailNotificador();
		
		PedidoService pedido = new PedidoService(email);
		pedido.finalizarPedido();
		
		PedidoService pedido2 = new PedidoService(sms);
		pedido2.finalizarPedido();
		
	}

}
