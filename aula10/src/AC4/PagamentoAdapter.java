package AC4;

public class PagamentoAdapter implements Pagamento{
	private final PagamentoLegado legado;
	
	public PagamentoAdapter(PagamentoLegado legado) {
		this.legado = legado;
	}
	
	@Override
	public void pagar (double valor) {
		double centavos = Math.round(valor * 100);
		legado.executarCobranca(centavos);
	}
}
