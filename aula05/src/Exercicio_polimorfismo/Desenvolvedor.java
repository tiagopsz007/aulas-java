package Exercicio_polimorfismo;

public class Desenvolvedor extends Funcionario{
	
	public Desenvolvedor(String nome) {
		super(nome);
	}
	
	@Override
	public void trabalhar() {
		System.out.println(nome +  " ta programando!");
	}
	
}