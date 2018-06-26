package br.qxd.ufc.musician_estore_center.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="classeProduto")
	private String classeProduto;
	
	@Column(name = "marca")
	private String marca;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "ano")
	private Integer ano;

	@Column(name = "preco")
	private Double preco;

	@Column(name = "emEstoque")
	private boolean emEstoque;

	@Column(name = "ehUsado")
	private boolean ehUsado;
	
	@Column(name = "descricao")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getClasseProduto() {
		return classeProduto;
	}

	public void setClasseProduto(String classeProduto) {
		this.classeProduto = classeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public boolean isEmEstoque() {
		return emEstoque;
	}

	public void setEmEstoque(boolean emEstoque) {
		this.emEstoque = emEstoque;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEhUsado() {
		return ehUsado;
	}

	public void setEhUsado(boolean ehUsado) {
		this.ehUsado = ehUsado;
	}

}