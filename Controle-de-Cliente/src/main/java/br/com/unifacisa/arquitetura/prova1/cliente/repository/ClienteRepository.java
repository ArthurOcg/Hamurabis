package br.com.unifacisa.arquitetura.prova1.cliente.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.unifacisa.arquitetura.prova1.cliente.entidades.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
