package br.fundatec.lp1.exeBD02;

public class Pessoa {
	private Long id;
	private String nm_nome;
	private String nr_cpf;
	private String ds_profissao;
	private int nr_idade;
	
	public Pessoa() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNm_nome() {
		return nm_nome;
	}

	public void setNm_nome(String nm_nome) {
		this.nm_nome = nm_nome;
	}

	public String getNr_cpf() {
		return nr_cpf;
	}

	public void setNr_cpf(String nr_cpf) {
		this.nr_cpf = nr_cpf;
	}

	public String getDs_profissao() {
		return ds_profissao;
	}

	public void setDs_profissao(String ds_profissao) {
		this.ds_profissao = ds_profissao;
	}

	public int getNr_idade() {
		return nr_idade;
	}

	public void setNr_idade(int nr_idade) {
		this.nr_idade = nr_idade;
	}
}


