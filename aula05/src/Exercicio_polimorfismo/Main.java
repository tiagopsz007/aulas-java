package Exercicio_polimorfismo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Gerente("Fulano");
		Funcionario funcionario2 = new Desenvolvedor("Beltrano");
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add (new Gerente("josé"));
		funcionarios.add (new Desenvolvedor("Maria"));
		
		for(Funcionario funcionario : funcionarios) {
			funcionario.trabalhar();
		}
	}

}
