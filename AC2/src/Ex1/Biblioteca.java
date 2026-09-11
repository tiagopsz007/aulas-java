package Ex1;

import java.util.ArrayList;
public class Biblioteca{
	private String nome;
	private ArrayList<Livro> livros;
	
	public Biblioteca(String nome, ArrayList<Livro> livros){
		this.nome = nome;
		this.livros = livros;
	}
	
	public void adicionar_livro(Livro livro) {
		livros.add(livro);
	}
	
	public void listar_livros() {
		System.out.printf("Biblioteca:%s %n", nome);
		
		for(Livro item : livros) {
			System.out.printf(
					"Livro: %s - Autor %s - Disponivel: %b %n", 
					item.getTitulo(),
					item.getAutor(),
					item.isDisponivel()
					);
		}
	}
	
	public void emprestar_livro(String titulo) {
		System.out.printf("Biblioteca:%s %n", nome);
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				if(livro.isDisponivel()) {
					livro.setDisponivel(false);
					System.out.printf(
							"Livro %s emprestado. %n",
							livro.getTitulo()
							);
					return;
				}
				
				System.out.printf(
						"Livro %s ja está emprestado",
						livro.getTitulo()
						);
				return;
			}
			
			System.out.println("Livro não encontrado");
		}
	}
	
	public void devolver_livro(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				livro.setDisponivel(true);
				System.out.printf(
						"Livro %s devolvido; %n",
						livro.getTitulo()
						);
				return;
			}
		}
		System.out.println("Livro não encontrado");
		return;
	}
	
	public void livros_disponiveis() {
		for(Livro livro : livros) {
			if(livro.isDisponivel()) {
				System.out.printf(
						"Livro: %s - Autor %s - Disponivel: %b %n", 
						livro.getTitulo(),
						livro.getAutor(),
						livro.isDisponivel()
						);
			}
		}
	}
}