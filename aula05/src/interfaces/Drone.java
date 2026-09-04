package interfaces;

public class Drone implements Voador{
	@Override
	public void voar() {
		System.out.println("O drone está voando");
	}
}
