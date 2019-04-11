package br.com.unifacisa.arquitetura.prova1.produto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.unifacisa.arquitetura.prova1.produto.entidades.Produto;

public interface ClienteRepository extends CrudRepository<Produto, Long>{

}
