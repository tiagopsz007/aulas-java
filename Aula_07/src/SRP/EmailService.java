package SRP;

public class EmailService {
	
	public void enviar(Funcionario funcionario) {
		   System.out.printf("Enviando e-mail para %s ... %n",
							funcionario.getNome()
							);
	}

}
