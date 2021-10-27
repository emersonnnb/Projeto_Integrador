package model;

import java.util.Date;

public class PessoaFisica extends Pessoa{
	
	private int cpf;
	private Date nascimento;
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public int ValidarCpf() {
		return cpf;		
	}
}
