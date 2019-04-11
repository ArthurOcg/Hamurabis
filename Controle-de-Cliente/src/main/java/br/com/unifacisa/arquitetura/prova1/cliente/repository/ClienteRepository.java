package br.com.unifacisa.arquitetura.prova1.cliente.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.arquitetura.prova1.cliente.entidades.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
