package br.fundatec.lp1.exeBD01;

import java.util.Calendar;

public class Contato {
	
	private Long id;
	private String nm_contato;
	private String ds_email;
	private String ds_endereco;
	private Calendar dt_nascimento;
	
	public Contato() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNm_contato() {
		return nm_contato;
	}

	public void setNm_contato(String nm_contato) {
		this.nm_contato = nm_contato;
	}

	public String getDs_email() {
		return ds_email;
	}

	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}

	public String getDs_endereco() {
		return ds_endereco;
	}

	public void setDs_endereco(String ds_endereco) {
		this.ds_endereco = ds_endereco;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	

}
