package br.com.unifacisa.arquitetura.prova1.autor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.arquitetura.prova1.autor.entidades.Autor;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long> {

}
