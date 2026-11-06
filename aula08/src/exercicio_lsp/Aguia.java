package exercicio_lsp;

public class Aguia extends Ave implements Voadora{
	
	@Override
	public void mover() {
		System.out.println("Aguia se movimentando");
	}
	
	@Override 
	public void voar() {
		System.out.println("Aguia esta voando");
	}
	
}
