package polimorfismo;

public abstract class Animal{
	protected String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void apresentar() {
		System.out.println("animal: " + nome);
	}
	
	/*public void emitirSom(){
		System.out.println("o animal emitiu um som");
	}*/
	
	public abstract void emitirSom();
}