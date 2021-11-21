package model;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fornecedor extends PessoaJuridica {

	public Fornecedor(String nome, String end, String tel, String email, String cnpj) {
		super(nome, end, tel, email, cnpj);

	}	

	public void salvar() {
		
		try {
			FileWriter fw = new FileWriter("Fornecedores.txt", true);
			PrintWriter pw = new PrintWriter(fw);			
			pw.printf("-------------------\nFornecedor: %s\nE-mail: %s\nCPF n. %s\n-------------------", super.getNome(), super.getEmail(), super.getCnpj());
			pw.flush();
			pw.close();
			fw.close();
		}catch(IOException erro) {
			System.out.println("Não há Fornecedor cadastrado.");
		}
		
	}
}