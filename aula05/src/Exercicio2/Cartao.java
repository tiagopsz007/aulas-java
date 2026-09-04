package Exercicio2;

public class Cartao extends Pagamento implements Comprovante{
	
	public Cartao (double valor) {
		super(valor);
	}
	@Override
	public void processar() {
		System.out.printf("pagamento PIX de R$ %.2f processado.", valor);
	
 }
	
	@Override
	
	public void gerarComprovante() {
		System.out.printf("pagamento PIX de R$ %.2f validado.", valor);
	}
	
}