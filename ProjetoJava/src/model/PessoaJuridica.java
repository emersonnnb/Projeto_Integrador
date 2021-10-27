package model;

public class PessoaJuridica extends Pessoa{
	
	private int cnpj;
	
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int validarCnpj() {
		return cnpj;
	}

}
