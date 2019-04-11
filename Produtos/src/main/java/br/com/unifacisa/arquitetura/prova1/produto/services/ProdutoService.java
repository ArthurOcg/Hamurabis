package br.com.unifacisa.arquitetura.prova1.produto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.arquitetura.prova1.produto.entidades.Produto;
import br.com.unifacisa.arquitetura.prova1.produto.repository.ProdutoRepository;

@Service
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
	
	public Produto consultarPorId(Long id) {
		return produtoRepository.findById(id).get(); 	
	}
	
	public List<Produto> consultar(){
		return (List<Produto>) produtoRepository.findAll();
	}
	
	public void remove(Long id) {
		produtoRepository.deleteById(id);
	}
}
