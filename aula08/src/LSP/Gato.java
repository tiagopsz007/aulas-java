package LSP;

public class Gato extends Animal{
	public class Cachorro {
		@Override
		public void emitirSom() {
			throw new UnsupportedOperationException("Nao e animal");
		}

	}
}