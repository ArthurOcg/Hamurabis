package br.com.unifacisa.arquitetura.prova1.autor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.unifacisa.arquitetura.prova1.autor.entidades.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long> {

}
