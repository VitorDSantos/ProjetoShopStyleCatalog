package mscatalog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mscatalog.dto.ProdutosDto;
import mscatalog.form.FormProduto;
import mscatalog.model.Produtos;
import mscatalog.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void cadastrar(FormProduto formProduto) {
		Produtos cadastroProd = new Produtos();
		
		cadastroProd.setNome(formProduto.getNome());
		cadastroProd.setDescricao(formProduto.getDescricao());
		cadastroProd.setAtivo(formProduto.getAtivo());
		cadastroProd.setCategoria(formProduto.getCategoria());
		
		produtoRepository.save(cadastroProd);
	}
	@Transactional
	public void atualizar(Long id, FormProduto formProduto) {
		Produtos atualizarProd = produtoRepository.getById(id);
		
		atualizarProd.setNome(formProduto.getNome());
		atualizarProd.setDescricao(formProduto.getDescricao());
		atualizarProd.setAtivo(formProduto.getAtivo());
		atualizarProd.setCategoria(formProduto.getCategoria());
		
		produtoRepository.save(atualizarProd);
	}
	
	public List<ProdutosDto> listar() {
		List<Produtos> prods;
		prods = produtoRepository.findAll();
		return ProdutosDto.converter(prods);
	}
	public ProdutosDto detalhar(Long id) {
		Produtos produtos = produtoRepository.getById(id);
		ProdutosDto pdto = new ProdutosDto();
		
		pdto.setNome(produtos.getNome());
		pdto.setDescricao(produtos.getDescricao());
		pdto.setAtivo(produtos.getAtivo());
		pdto.setCategoria(produtos.getCategoria());

		return pdto;
	}

	public void remover(Long id) {
		produtoRepository.deleteById(id);
	}
}