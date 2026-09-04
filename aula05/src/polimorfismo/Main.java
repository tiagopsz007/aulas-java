package polimorfismo;

public class Main{
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Rex");
		Animal animal1 = new Gato("Max");
		Animal animal2 = new Cachorro("Toto");
		
		cachorro.apresentar();
		cachorro.emitirSom();
		animal1.apresentar();
		animal2.apresentar();
		
	}
}