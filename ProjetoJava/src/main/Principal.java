package main;

import java.util.Scanner;

import model.Aluno;
import model.Fornecedor;
import model.Professor;


public class Principal {
	
	public static void main(String[] args) {
		
		char continuar;
		
		do {			
			Scanner scan = new Scanner(System.in);
			
			apresentacao(); 
						
			int escolha = scan.nextInt(); 
			
			switch (escolha) {
				case 1:
					cadastro(escolha);	
					break;
				case 2:
					cadastro(escolha);	
					break;
				case 3:
					cadastro(escolha);	
					break;
				case 4:
					Aluno.getLista();
					break;
				case 5:
					Professor.getLista();
					break;
				case 6:
					Fornecedor.getLista();
					break;
				default: 
					System.out.println("Opção inválida.");
			}
			System.out.println("Deseja sair do sistema? S/N");
			continuar = scan.next().charAt(0); 
			
		}while(continuar != 'n' || continuar != 'N'); 
			

	}
	
	public static void apresentacao() {
		System.out.println("------- Bem-vindo ao sistema universitário -------");
		System.out.println("Escolha uma das opções para continuar");
		System.out.println("1.Cadastro de aluno");
		System.out.println("2.Cadastro de professor");
		System.out.println("3.Cadastro de fornecedor");
		System.out.println("4.Gerar lista de alunos");
		System.out.println("5.Gerar lista de professores");
		System.out.println("6.Gerar lista de fornecedores");
	}
	
	public static void cadastro(int escolha) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
	
		System.out.println("Cadastramento");
		System.out.println("Nome completo: ");
		String nome = scan.next(); 
		
		System.out.println("Endereço: ");
		String endereco = scan2.next(); 
		
		System.out.println("Telefone ");
		String telefone = scan.next(); 
		
		System.out.println("E-mail: ");
		String email = scan.next(); 
		
		System.out.println("CPF: ");
		String cpf_cnpj = scan.next(); 
		
		switch(escolha) {
			case 1:
				Aluno aluno = new Aluno(nome, endereco, telefone, email, cpf_cnpj);
				Aluno.addNaLista(aluno);
				break;
			case 2:
				Professor professor = new Professor(nome, endereco, telefone, email,cpf_cnpj);
				Professor.addNaLista(professor);
				break;
			case 3: 
				Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, email, cpf_cnpj);
				Fornecedor.addNaLista(fornecedor);
				break;
		}
		
		System.out.println("Cadastro realizado com sucesso.");
	}
	
	
}
