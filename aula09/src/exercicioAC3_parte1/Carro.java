package exercicioAC3_parte1;

public class Carro  extends Veiculo implements Motorizado{
	@Override
	public void ligarMotor() {
		System.out.println("Carro ligado...");
		
	}
	
	@Override
	public void mover() {
		System.out.println("Carrop esta andando...");
	}

}
