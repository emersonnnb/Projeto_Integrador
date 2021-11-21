package model;

public abstract class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica(String nome, String end, String tel, String email, String cpf) {
		super(nome, end, tel, email);
		this.cpf = cpf;

	}

	public String getCpf() {
		return this.cpf;
	}

	

}
