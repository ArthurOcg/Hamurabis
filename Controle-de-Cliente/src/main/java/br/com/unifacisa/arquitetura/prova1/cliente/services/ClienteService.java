package br.com.unifacisa.arquitetura.prova1.cliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.arquitetura.prova1.cliente.entidades.Cliente;
import br.com.unifacisa.arquitetura.prova1.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente cadastrar(Cliente cliente)throws Exception {
		try {
			return clienteRepository.save(cliente);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Cliente consultarPorId(Long id) {
		return clienteRepository.findById(id).orElse(null); 	
	}
	
	public List<Cliente> consultar(){
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public void remove(Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
}
