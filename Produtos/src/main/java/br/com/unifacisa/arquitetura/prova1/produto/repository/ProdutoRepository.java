package br.com.unifacisa.arquitetura.prova1.produto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.arquitetura.prova1.produto.entidades.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
