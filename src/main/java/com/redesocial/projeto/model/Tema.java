package com.redesocial.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_temas")
public class Tema {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo nome é obrigatório")
	@Size(min = 5 , max = 100, message = "O atributo deve conter min 5 e maximo 100 caracteres")
	private String nome;
	
	@NotNull (message = "O atributo descrição é obrigatório")
	@Size(min = 5, max = 1000, message = "O atributo deve conter min 5 e max 1000 caracteres")
	private String descricao;

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
	
	
}
