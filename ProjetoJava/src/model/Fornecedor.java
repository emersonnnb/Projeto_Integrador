package model;
import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica {
	static int geradorMatricula = 0;
	private String cadastroFornecedor;
	
	static ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>(); 

	public Fornecedor(String nome, String end, String tel, String email, String cnpj) {
		super(nome, end, tel, email, cnpj);
		this.cadastroFornecedor = gerador();
	}

	public String getCadastro() {
		return this.cadastroFornecedor;
	}
	
	private String gerador() {
		int numero = Professor.geradorMatricula++;
		String matricula_gerada = "234125-" + Integer.toString(numero) + "-F"; // 234125 + numero gerado + F (fornecedor)
		return matricula_gerada; 
	}
	
	public static void addNaLista(Fornecedor fornecedor){
		listaFornecedor.add(fornecedor);
	}

	public static void getLista(){
		for(int i = 0; i < listaFornecedor.size(); i++) {
			System.out.println(listaFornecedor.get(i));
		}
	}
	
	protected String validarCnpj() {
		return "abd";
	}
	
	public String toString() {
		return String.format("Fornecedor: %s\n cadastro n. %s\nE-mail: %s\nCPF n. %s\n-------------------", super.getNome(), this.cadastroFornecedor,
				super.getEmail(), super.getCnpj());
	}
}