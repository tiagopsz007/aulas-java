package temperatura;

public class AlertaCalor implements ObservadorTemperatura{
	@Override
	public void atualizar(double temperatura){
		if(temperatura > 35 ) {
			System.out.printf("Alerta de calor: %.0f °",
					temperatura);
		}
	}

}
