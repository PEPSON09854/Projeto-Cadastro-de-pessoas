package cliente;

import java.util.Scanner;

public abstract class Pessoa {
	
	private String nome;
	private String telefone;
	private Endereco local = new Endereco();
	
	public void cadastrar() {
		
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		nome = tec.nextLine();
		System.out.println("Digite o telefone: ");
		telefone = tec.nextLine();
		local.cadastrar();
		
	}
	
	public void imprime() {
		System.out.println("Nome: " + getNome());
	}
	
	public Endereco getRua() {
		return local;
	}
	
	public void setRua(Endereco local) {
		this.local = local;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
