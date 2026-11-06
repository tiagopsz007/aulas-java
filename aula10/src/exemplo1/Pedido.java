package exemplo1;

import java.util.List;
import java.util.ArrayList;


public class Pedido {
	private List<Observador> observadores;
	private String status;
	
	public Pedido() {
		this.observadores = new ArrayList<>();
		this.status = "PENDENTE";
	}
	
	public void AdicionarObservador(Observador observador) {
		this.observadores.add(observador);
	}
	
	public void removerObservador(Observador observador) {
		this.observadores.remove(observador);
	}
	
	private void notificadorObservadores() {
		for(Observador observador : observadores) {
			observador.atualizar("Pedido atualizado: "+ status);
		}
	}
	
	public void confirmarPedido() {
		this.status = "CONFIRMADO";
		this.notificadorObservadores();
	}
	
	
	
	
	
}
