package Exercicio_polimorfismo;

public class Gerente extends Funcionario{
	
	public Gerente(String nome) {
		super(nome);
	}
	
	@Override
	public void trabalhar() {
		System.out.println(nome + " esta gerenciando a equipe");
	}
	
}
