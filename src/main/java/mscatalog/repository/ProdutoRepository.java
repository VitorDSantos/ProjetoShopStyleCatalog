package mscatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mscatalog.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{
	
}
