package model;

import java.util.ArrayList;

public class Professor extends PessoaFisica {
	static int geradorMatricula = 0;
	private String cadastroProfessor;
	
	static ArrayList<Professor> listaProfessor = new ArrayList<Professor>(); 

	public Professor(String nome, String end, String tel, String email, String cpf) {
		super(nome, end, tel, email, cpf);
		this.cadastroProfessor = gerador();
	}

	public String getCadastroTrabalho() {
		return this.cadastroProfessor;
	}
	
	private String gerador() {
		int numero = Professor.geradorMatricula++;
		String matricula_gerada = "234125-" + Integer.toString(numero) + "-P"; // 234125 + numero gerado + P (professor)
		return matricula_gerada; 
	}

	public static void addNaLista(Professor professor){
		listaProfessor.add(professor);
	}

	public static void getLista(){
		for(int i = 0; i < listaProfessor.size(); i++) {
			System.out.println(listaProfessor.get(i));
		}
	}
	
	protected String validarCpf() {
		return "abd";
	}
	
	public String toString() {
		return String.format("Professor: %s\nMatrícula n. %s\nE-mail: %s\nCPF n. %s\n-------------------", super.getNome(), this.cadastroProfessor,
				super.getEmail(), super.getCpf());
	}
}
