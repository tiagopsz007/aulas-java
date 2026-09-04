package Exercicio2;

public class Pix extends Pagamento implements Comprovante{
	public Pix(double valor) {
		super(valor);
	}
	@Override
	public void processar() {
		System.out.printf("pagamento PIX de R$ %.2f processado.", valor);
		
	}
	
	@Override
	
	public void gerarComprovante() {
		System.out.printf("pagamento Cartao de R$ %.2f validado.", valor);
	}

}
