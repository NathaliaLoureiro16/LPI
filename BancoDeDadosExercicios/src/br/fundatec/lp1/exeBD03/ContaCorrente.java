package br.fundatec.lp1.exeBD03;

public class ContaCorrente {
	private Long id;
	private String nm_nomeDono;
	private int nr_saldo;
	private int nr_limite;
	private boolean nr_investimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public int getNr_limite() {
		return nr_limite;
	}

	public void setNr_limite(int nr_limite) {
		this.nr_limite = nr_limite;
	}

	public boolean isNr_investimento() {
		return nr_investimento;
	}

	public void setNr_investimento(boolean nr_investimento) {
		this.nr_investimento = nr_investimento;
	}

}
