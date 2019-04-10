package br.com.unifacisa.arquitetura.prova1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.unifacisa.arquitetura.prova1.entidades.Produto;
import br.com.unifacisa.arquitetura.prova1.repository.ProdutoRepository;

public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto cadastrar(Produto produto)throws Exception {
		try {
			return produtoRepository.save(produto);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Optional<Produto> consultarPorId(Long id) {
		return produtoRepository.findById(id); 	
	}
	
	public List<Produto> consultar(){
		return (List<Produto>) produtoRepository.findAll();
	}
	
	public void remove(Produto produto) {
		produtoRepository.delete(produto);
	}
}
