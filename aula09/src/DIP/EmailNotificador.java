package DIP;

public class EmailNotificador implements Notificador{
	@Override
	public void enviar(String mensagem) {
		System.out.println("Email" + mensagem);
	}

}
