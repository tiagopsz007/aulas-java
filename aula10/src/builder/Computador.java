package builder;

public class Computador {
	private final String processador;
	private final int memoriaRAM;
	private final int armazenamento;
	private final String placaVideo;
	
	private Computador(Builder builder) {
		this.processador = builder.processador;
		this.memoriaRAM = builder.memoriaRAM;
		this.armazenamento = builder.armazenamento;
		this.placaVideo = builder.placaVideo;
		
	}
	
	public void exibirConfiguracao() {
		System.out.println("Processador: "+ this.processador);
		System.out.println("Memoria RAM: "+ this.memoriaRAM);
		System.out.println("Armazenamento: "+ this.armazenamento);
		System.out.println("Placa de Video: "+ this.placaVideo);
	}
	
	public static class Builder{
		
		private String processador;
		private int memoriaRAM;
		private int armazenamento;
		private String placaVideo = "Integrada";
		
		public Builder(String processador) {
			this.processador = processador;
		}
		
		public Builder memoriaRAM(int memoriaRAM) {
			this.memoriaRAM = memoriaRAM;
			return this;
		}
		
		public Builder placaVideo(String placa) {
			this.placaVideo = placa;
			return this;
		}
		
		public Builder armazenamento(int armazenamento) {
			this.armazenamento = armazenamento;
			return this;
		}
		
		public Computador build() {
			if(processador == null || processador.isBlank()
					|| memoriaRAM <= 0 || armazenamento <= 0) {
				throw new IllegalStateException("configuração invalida");
			}
			
			return new Computador(this);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
