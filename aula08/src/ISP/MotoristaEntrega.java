package ISP;

public class MotoristaEntrega implements Trabalhavel, Motorista{

	@Override
	public void trabalhar() {
		System.out.println("Realizando entrega");
	}
	
	@Override
	public void dirigir() {
		System.out.println("dirigindo veiculo");
	}
		
}
