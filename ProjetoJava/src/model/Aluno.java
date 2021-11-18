package model;
import java.io.*;

public class Aluno extends PessoaFisica {
	
	public Aluno(String nome, String end, String tel, String email, String cpf) {
		super(nome, end, tel, email, cpf);
		
	}

	protected String validarCpf() {
		return "abc";

	}
	
	@Override 
	public void salvar() {
		
		try {
			FileWriter fw = new FileWriter("Alunos.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.printf("-------------------\nAluno: %s\nE-mail: %s\nCPF n. %s\n-------------------", super.getNome(),super.getEmail(), super.getCpf());
			pw.flush();
			pw.close();
			fw.close();
		}catch(IOException erro) {
			System.out.println("Ocorreu um erro. O arquivo não foi salvo.");
		}
		
	}

	
}
