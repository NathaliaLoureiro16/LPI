package br.fundatec.lp1.exeBD03;

public class ContaPoupanca {
	private long id;
	private String nm_nomeDono;
	private int nr_saldo;
	private String ds_tipo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNm_nomeDono() {
		return nm_nomeDono;
	}
	public void setNm_nomeDono(String nm_nomeDono) {
		this.nm_nomeDono = nm_nomeDono;
	}
	public int getNr_saldo() {
		return nr_saldo;
	}
	public void setNr_saldo(int nr_saldo) {
		this.nr_saldo = nr_saldo;
	}
	public String getDs_tipo() {
		return ds_tipo;
	}
	public void setDs_tipo(String ds_tipo) {
		this.ds_tipo = ds_tipo;
	}
	
}