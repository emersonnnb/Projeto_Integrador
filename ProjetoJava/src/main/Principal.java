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
		int op=0;
			
		Scanner sc = new Scanner(System.in);		
		
		do {			
			System.out.println("------- Bem-vindo ao sistema universitário -------\n");
			System.out.println("1 - Cadastro de aluno");
			System.out.println("2 - Cadastro de professor");
			System.out.println("3 - Cadastro de fornecedor");
			System.out.println("4 - Exibir lista de alunos");
			System.out.println("5 - Exibir lista de professores");
			System.out.println("6 - Exibir lista de fornecedores");
			System.out.println("7 - Sair");	
			System.out.println("\nDigite uma opção desejada: ");
			op=sc.nextInt();
			
			switch (op) {
			
			case 1:
				System.out.println("\n** Cadastro de Alunos ** \n");
				cadastro(op);			    
				break;
			case 2:
				System.out.println("\n** Cadastro de Professores ** \n");
				cadastro(op);
				break;
			case 3:
				System.out.println("\n** Cadastro de Fornecedores ** \n");
				cadastro(op);
				break;
			case 4:
				carregar("Alunos.txt");
				System.out.print ("Tecle Enter para continuar .... "); 
				System.in.read ();
				break;
			case 5:				
				carregar("Professores.txt");
				System.out.print ("Tecle Enter para continuar .... "); 
				System.in.read ();
				break;
			case 6:
				
				carregar("Fornecedores.txt");
				System.out.print ("Tecle Enter para continuar .... "); 
				System.in.read ();
				break;
			case 7:
				System.out.println("SAINDO....");
				System.exit(0);				
			default:
				System.out.println("\n***********************");
				System.out.println("*** Opção Invalida! ***");
				System.out.println("***********************\n");
				break;			
			}			
		}while(op>0 || op<7);	
		
	}


	public static void cadastro(int escolha) throws IOException {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Nome completo: ");
		String nome = sc.nextLine(); 		
		System.out.println("Endereço: ");
		String endereco = sc.nextLine(); 		
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();		
		System.out.println("E-mail: ");
		String email = sc.nextLine(); 			
		System.out.println("CPF: ");
		String cpf_cnpj = sc.nextLine(); 
		
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
		
		System.out.println("\nCadastro realizado com sucesso!!\n");
		System.out.print ("Tecle Enter para continuar .... \n"); 
		System.in.read ();
		
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
			System.out.println("Não foi possivel retornar usuarios cadastrados.");
			System.out.print ("Tecle Enter para continuar .... "); 
			System.in.read ();
		}
		
	}
	
	public class LimpaConsole {
	    public static void main(String[] args) throws IOException, InterruptedException {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Teste");
	        String texto = scanner.next();

	        //Limpa a tela no windows, no linux e no MacOS
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");

	    }
	}
}

