package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import model.Aluno;
import model.Fornecedor;
import model.Professor;


public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		int n = 0;
		
		while(n != 1){			
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
					carregar("Alunos.txt");
					break;
				case 5:
					carregar("Professores.txt");
					break;
				case 6:
					carregar("Fornecedores.txt");
					break;
				default: 
					System.out.println("Opção inválida.");
			}
			
			System.out.println("Para encerrar, clique '1'");
			System.out.println("Para continuar, clique '0'");
			n = scan.nextInt();		
			
		}
			
		System.out.println("Até mais!");

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
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in); //problema na inserção de dados pelo usuário
	
		System.out.println("Cadastramento");
		System.out.println("Nome completo: ");
		String nome = scan.next(); 
		
		System.out.println("Endereço: ");
		String endereco = scan2.next(); 
		
		System.out.println("Telefone ");
		String telefone = scan3.next(); 
		
		System.out.println("E-mail: ");
		String email = scan4.next(); 
		
		System.out.println("CPF: ");
		String cpf_cnpj = scan5.next(); 
		
		switch(escolha) {
			case 1:
				Aluno aluno = new Aluno(nome, endereco, telefone, email, cpf_cnpj);
				aluno.salvar();
				break;
			case 2:
				Professor professor = new Professor(nome, endereco, telefone, email,cpf_cnpj);
				professor.salvar();
				break;				
			case 3: 
				Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, email, cpf_cnpj);
				fornecedor.salvar(); 
				break;
		}
		
		System.out.println("Cadastro realizado com sucesso.");
	}
	
	
	
	public static void carregar(String caminho) throws IOException{
		String linha = new String(); 
		
		try {
			FileReader leitor = new FileReader(caminho);
			BufferedReader bufferDeArquivo = new BufferedReader(leitor);
			
			while(true) {
				linha = bufferDeArquivo.readLine(); 
				
				if (linha == null) {
					break;
				}
				System.out.println(linha);
				
			}
		}catch(Exception e) {
			System.out.println("Não foi possível retornar os usuários cadastrados.");
		}
		
	}
	
	
}
