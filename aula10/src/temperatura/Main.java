package temperatura;

public class Main {

	public static void main(String[] args) {
		EstacaoMeteorologica estacao = new EstacaoMeteorologica();
		
		ObservadorTemperatura temperatura = new DisplayTemperatura();
		ObservadorTemperatura alerta = new AlertaCalor();
		ObservadorTemperatura alerta2 = new AlertaFrio();
		
		estacao.armazenarAlerta(temperatura);
		estacao.armazenarAlerta(alerta);
		estacao.armazenarAlerta(alerta2);
		
		estacao.confirmarTemperatura(36);
	}

}
