package Ex1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<>();
		
		livros.add(new Livro("Dom Casmuro", "Miguel Servantes", true));
		livros.add(new Livro("Sono Pesado", "Castrin", true));
		livros.add(new Livro("O homem do php", "PHP", true));
		livros.add(new Livro("AI generate", "Leandro", true));
		livros.add(new Livro("Music", "Chis", true));
		
		Biblioteca biblioteca = new Biblioteca("Pokemon", livros);
		
		Livro novo_livro = new Livro("O pequeno principe", "Antoine", true);
		
		biblioteca.listar_livros();
		biblioteca.adicionar_livro(novo_livro);
		System.out.println("======================");
		
		System.out.println("Novo livro adicionado.");
		biblioteca.listar_livros();

		System.out.println("======================");
		
		System.out.println("Emprestar livro:");
		biblioteca.emprestar_livro("Music");
	}

}
