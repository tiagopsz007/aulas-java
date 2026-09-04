package interfaces;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Voador> voadores = new ArrayList<>();
		
		voadores.add(new Passaro());
		voadores.add(new Aviao());
		voadores.add(new Drone());
		for(Voador voador : voadores) {
			voador.voar();
		}
	}

}

//