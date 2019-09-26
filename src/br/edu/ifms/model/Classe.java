package br.edu.ifms.model;

import java.util.Date;

public class Classe {

	private Integer codigo;
	private String titulo;
	private String descricao;
	private String observacao;
	private Date dataAtualizacao;
	private Date dataCadastro;
	private Double dinheiroInicial;
	private boolean magia;
	private char racaComVantagem;
	private Integer modificador;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Double getDinheiroInicial() {
		return dinheiroInicial;
	}
	public void setDinheiroInicial(Double dinheiroInicial) {
		this.dinheiroInicial = dinheiroInicial;
	}
	public boolean isMagia() {
		return magia;
	}
	public void setMagia(boolean magia) {
		this.magia = magia;
	}
	public char getRacaComVantagem() {
		return racaComVantagem;
	}
	public void setRacaComVantagem(char racaComVantagem) {
		this.racaComVantagem = racaComVantagem;
	}
	public Integer getModificador() {
		return modificador;
	}
	public void setModificador(Integer modificador) {
		this.modificador = modificador;
	}
	
	
	
}
