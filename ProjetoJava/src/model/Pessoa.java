package model;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String email;

	public Pessoa(String nome, String end, String tel, String email) {
		this.nome = nome;
		this.endereco = end;
		this.telefone = tel;
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEnd() {
		return this.endereco;
	}

	public String getTel() {
		return this.telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEnd(String end) {
		this.endereco = end;
	}

	public void setTel(String tel) {
		this.telefone = tel;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
