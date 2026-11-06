package temperatura;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {
	private List<ObservadorTemperatura> temperaturas;
	
	public EstacaoMeteorologica() {
		this.temperaturas = new ArrayList<>();
	}
	
	public void armazenarAlerta(ObservadorTemperatura novaT) {
		this.temperaturas.add(novaT);
	}
	
	private void notificarObservador(double temperatura) {
		for(ObservadorTemperatura item : temperaturas) {
			item.atualizar(temperatura);
		}
	}
	
	public void confirmarTemperatura(double novaTemperatura) {
		notificarObservador(novaTemperatura);
	}
	
}
