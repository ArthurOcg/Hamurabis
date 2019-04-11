package br.com.unifacisa.arquitetura.prova1.produto.controllers;

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

import br.com.unifacisa.arquitetura.prova1.produto.entidades.Produto;
import br.com.unifacisa.arquitetura.prova1.produto.services.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Produto>> getAll(){
		return new ResponseEntity<List<Produto>>(produtoService.consultar(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getId(@PathVariable Long id){
		return new ResponseEntity<Produto>(produtoService.consultarPorId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto){
		try {
			return new ResponseEntity<Produto>(produtoService.cadastrar(produto), HttpStatus.CREATED);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ResponseEntity<Produto>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Produto> remover(@PathVariable Long id){
		try {
			produtoService.remove(id);
			return new ResponseEntity<Produto>(HttpStatus.OK);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return new ResponseEntity<Produto>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
