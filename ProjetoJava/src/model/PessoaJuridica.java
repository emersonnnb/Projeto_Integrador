package model;

public abstract class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome, String end, String tel, String email, String cnpj) {
		super(nome, end, tel, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}