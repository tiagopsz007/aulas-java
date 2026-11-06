package temperatura;

public class AlertaFrio implements ObservadorTemperatura{
	@Override
	public void atualizar(double temperatura){
		if(temperatura < 10 ) {
			System.out.printf("Alerta de frio: %.0f °",
					temperatura);
		}
	}

}
