package br.com.unifacisa.arquitetura.prova1.cliente.controllers;

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

import br.com.unifacisa.arquitetura.prova1.cliente.entidades.Cliente;
import br.com.unifacisa.arquitetura.prova1.cliente.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Cliente>> getAll(){
		return new ResponseEntity<List<Cliente>>(clienteService.consultar(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getId(@PathVariable Long id){
		return new ResponseEntity<Cliente>(clienteService.consultarPorId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente produto){
		try {
			return new ResponseEntity<Cliente>(clienteService.cadastrar(produto), HttpStatus.CREATED);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> remover(@PathVariable Long id){
		try {
			clienteService.remove(id);
			return new ResponseEntity<Cliente>(HttpStatus.OK);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
