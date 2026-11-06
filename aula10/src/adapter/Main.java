package adapter;

public class Main {

	public static void main(String[] args) {
		SistemaPagamentoAntigo antigo = new SistemaPagamentoAntigo();
		
		Pagamento pagamento = new PagamentoAdapter(antigo);
		
		pagamento.pagar(500.0);
	}

}
