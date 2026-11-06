package br.com.loja.repository;

import br.com.loja.model.Produto;
import br.com.loja.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class ProdutoRepository {
	public void salvar (Produto produto) {
		EntityManager em = JPAUtil.getFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			em.persist(produto);
			
			em.getTransaction().commit();
			
		}catch( RuntimeException e ) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().getRollbackOnly();
			}
			
			throw e;
			
		}finally {
			em.close();
		}
	}
	
	public Produto buscar(Long id) {
		EntityManager em =
				JPAUtil.getFactory().createEntityManager();
		
		try {
			return em.find(Produto.class, id);
		}finally {
			em.close();
		}
	}
}
