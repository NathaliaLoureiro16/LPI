package br.fundatec.lp1.exeBD04;

public class Venda {
	private long id;
	private String nm_nomeVendedor;
	private String nm_nomeComprador;
	private float nr_preco;
	private int nr_qtdItens;
	private String ds_formaPagamento;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNm_nomeVendedor() {
		return nm_nomeVendedor;
	}
	public void setNm_nomeVendedor(String nm_nomeVendedor) {
		this.nm_nomeVendedor = nm_nomeVendedor;
	}
	public String getNm_nomeComprador() {
		return nm_nomeComprador;
	}
	public void setNm_nomeComprador(String nm_nomeComprador) {
		this.nm_nomeComprador = nm_nomeComprador;
	}
	public float getNr_preco() {
		return nr_preco;
	}
	public void setNr_preco(float nr_preco) {
		this.nr_preco = nr_preco;
	}
	public int getNr_qtdItens() {
		return nr_qtdItens;
	}
	public void setNr_qtdItens(int nr_qtdItens) {
		this.nr_qtdItens = nr_qtdItens;
	}
	public String getDs_formaPagamento() {
		return ds_formaPagamento;
	}
	public void setDs_formaPagamento(String ds_formaPagamento) {
		this.ds_formaPagamento = ds_formaPagamento;
	}


}
