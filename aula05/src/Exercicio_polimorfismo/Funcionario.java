package Exercicio_polimorfismo;

public abstract class Funcionario{
	protected String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	/*public void trabalhar() {
		System.out.println("o trabalhador trabalha");
	}*/
	
	public abstract void trabalhar();
	
}