package Ex1;

public class Livro {
	private String titulo;
	private String autor;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponibilidade) {
		this.disponivel = disponibilidade;
	}
	
}