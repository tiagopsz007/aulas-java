package DIP;

public class PedidoService {
	//private EmailService emailService = new EmailService();
	private Notificador notificador;
	
	public PedidoService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void finalizarPedido( ) {
		System.out.println("Pedido Finalizado");
		notificador.enviar("Seu pedido foi finalizado");
	}

}
