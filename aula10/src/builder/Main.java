package builder;

public class Main {

	public static void main(String[] args) {
		Computador computador = new Computador.Builder("intel i7")
				.memoriaRAM(32)
				.armazenamento(1000)
				.placaVideo("RX 6600")
				.build();
		
		computador.exibirConfiguracao();
	}

}
