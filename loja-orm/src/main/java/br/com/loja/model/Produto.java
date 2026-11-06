package br.com.loja.model;
import jakarta.persistence.*;
@Entity
@Table(name = "produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	private double preco;
	
	public Produto() {}
	public Produto(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPreco() {
		return preco;
	}

}
