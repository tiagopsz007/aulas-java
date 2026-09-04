package Exercicio2;

public abstract class Pagamento {
	protected double valor;
	
	public Pagamento(double valor) {
		this.valor = valor;
	}
	
	public abstract void processar();
	
	public abstract void gerarComprovante();

}
