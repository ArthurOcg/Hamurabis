package br.com.unifacisa.arquitetura.prova1.autor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.arquitetura.prova1.autor.entidades.Autor;
import br.com.unifacisa.arquitetura.prova1.autor.repository.AutorRepository;


@Service
public class AutorService {

	@Autowired
	private AutorRepository autorRepository;
	
	public Autor cadastrar(Autor autor)throws Exception {
		try {
			return autorRepository.save(autor);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Autor consultarPorId(Long id) {
		return autorRepository.findById(id).get(); 	
	}
	
	public List<Autor> consultar(){
		return (List<Autor>) autorRepository.findAll();
	}
	
	public void remove(Long id) {
		autorRepository.deleteById(id);
	}
	
}
