package mscatalog.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import mscatalog.model.Categoria;

public class FormProduto {
	@NotNull @NotEmpty 
	String nome;
	
	@NotNull @NotEmpty 
	String descricao;
	
	@NotNull @NotEmpty 
	String ativo;
	
	@NotNull @NotEmpty 
	List<Categoria> categoria;

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
	
	
}
