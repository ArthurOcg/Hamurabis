package br.com.unifacisa.arquitetura.prova1.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.unifacisa.arquitetura.prova1.entidades.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
