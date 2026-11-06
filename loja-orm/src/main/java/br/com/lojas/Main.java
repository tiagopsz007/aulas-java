package br.com.lojas;

import br.com.loja.model.Produto;
import br.com.loja.repository.ProdutoRepository;
import br.com.loja.util.JPAUtil;

public class Main {

	public static void main(String[] args) {
		try {
			ProdutoRepository repository = new ProdutoRepository();
			
			Produto produto = new Produto("teclado", 150.00);
			
			repository.salvar(produto);
			
			Produto encontrado = repository.buscar(produto.getId());
			
			if(encontrado != null) {
				System.out.println("Produto" + encontrado.getName());
			}
		}finally {
			JPAUtil.fechar();
		}

	}

}
