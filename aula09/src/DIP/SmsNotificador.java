package DIP;

public class SmsNotificador {
	@Override
	public void enviar(String mensagem) {
		System.out.println("Sms: " + mensagem);
	}

}
