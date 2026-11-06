package exercicioAC3_parte1;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		veiculos.add(new Carro());
		veiculos.add(new Carro());
		veiculos.add(new Moto());
		veiculos.add(new Bicicleta());
		
		for(Veiculo veiculo: veiculos) {
			veiculo.mover();
		}
	}

}
