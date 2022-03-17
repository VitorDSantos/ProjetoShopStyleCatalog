package mscatalog.dto;

import java.util.List;
import java.util.stream.Collectors;

import mscatalog.model.Categoria;
import mscatalog.model.Produtos;




public class ProdutosDto {
	private Long id;
	
	private String nome;

	private String descricao;

	private String ativo;

	private List<Categoria> categoria;
	
	public ProdutosDto (Produtos produtos) {
		
		this.id = produtos.getId();
		this.nome = produtos.getNome();
		this.descricao = produtos.getDescricao();
		this.ativo = produtos.getAtivo();
		this.categoria = produtos.getCategoria();
	}

	public ProdutosDto() {
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public static List<ProdutosDto> converter(List<Produtos> produtos) {
		 
		return produtos.stream().map(ProdutosDto::new).collect(Collectors.toList());
	}
}
