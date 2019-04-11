package br.com.unifacisa.arquitetura.prova1.autor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisa.arquitetura.prova1.autor.entidades.Autor;
import br.com.unifacisa.arquitetura.prova1.autor.services.AutorService;


@RestController
@RequestMapping("autores")
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Autor>> getAll(){
		return new ResponseEntity<List<Autor>>(autorService.consultar(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Autor> getId(@PathVariable Long id){
		return new ResponseEntity<Autor>(autorService.consultarPorId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Autor> cadastrar(@RequestBody Autor autor){
		try {
			return new ResponseEntity<Autor>(autorService.cadastrar(autor), HttpStatus.CREATED);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return new ResponseEntity<Autor>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Autor> remover(@PathVariable Long id){
		try {
			autorService.remove(id);
			return new ResponseEntity<Autor>(HttpStatus.OK);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ResponseEntity<Autor>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
