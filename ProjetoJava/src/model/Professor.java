package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Professor extends PessoaFisica {
	
	public Professor(String nome, String end, String tel, String email, String cpf) {
		super(nome, end, tel, email, cpf);
		
	}
		
	protected String validarCpf() {
		return "abd";
	}
	
	@Override
	public void salvar() {
		
		try {
			FileWriter fw = new FileWriter("Professores.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.printf("-------------------\nProfessor: %s\nMatrícula n. %s\nE-mail: %s\nCPF n. %s\n-------------------", super.getNome(), super.getEmail(), super.getCpf());
			pw.flush();
			pw.close();
			fw.close();
		}catch(IOException erro) {
			System.out.println("Ocorreu um erro. O arquivo não foi salvo.");
		}
		
	}
}
