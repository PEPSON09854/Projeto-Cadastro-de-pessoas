package cliente;

import java.util.Scanner;

public class PessoaFisica extends Pessoa{
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void cadastrar() {
		System.out.println("-----Cadastro de Pessoa Física-----");
		super.cadastrar();
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite o CPF: ");
		cpf = tec.nextLine();	
	}
	
	@Override
	public void imprime() {
		System.out.println("Pessoa Física");
		super.imprime();
		System.out.println("CPF: " + cpf + "\n");
	}

}
