package model;

import java.util.ArrayList;
import java.util.List;


public class Aluno extends PessoaFisica {
	static int geradorMatricula = 0;
	private String matricula;
	
	static List<Aluno> listaAlunos = new ArrayList<Aluno>(); 

	public Aluno(String nome, String end, String tel, String email, String cpf) {
		super(nome, end, tel, email, cpf);
		this.matricula = gerador();
	}

	public String getMatricula() {
		return this.matricula;
	}
	
	public static void addNaLista(Aluno aluno){
		listaAlunos.add(aluno);
	}

	private String gerador() {
		int numero = Aluno.geradorMatricula++;
		String matricula_gerada = "234125-" + Integer.toString(numero) + "-A"; // 234125 + numero gerado + A (aluno)
		return matricula_gerada; 
	}

	public static void getLista(){
		for(int i = 0; i < listaAlunos.size(); i++) {
			System.out.println(listaAlunos.get(i));
		}
	}
	protected String validarCpf() {
		return "abc";

	}

	public String toString() {
		return String.format("Aluno: %s\nMatrícula n. %s\nE-mail: %s\nCPF n. %s\n-------------------", super.getNome(), this.matricula,
				super.getEmail(), super.getCpf());
	}
}
