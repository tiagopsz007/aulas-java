package SRP;

public class FuncionarioRepository {
	
	public void salvar(Funcionario funcionario) {
		System.out.printf("Funcionario %s salvando no banco ... %n",
							funcionario.getNome()
							);
	}
	
}
