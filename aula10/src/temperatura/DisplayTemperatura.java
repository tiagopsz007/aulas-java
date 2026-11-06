package temperatura;

public class DisplayTemperatura implements ObservadorTemperatura{
	@Override
	public void atualizar(double temperatura) {
		System.out.printf(
				"Temperatura atual: %.0f °\n",
				temperatura);
	}
}
