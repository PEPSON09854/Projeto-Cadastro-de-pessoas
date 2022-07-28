package cliente;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void cadastrar() {
		System.out.println("------Cadastro de Pessoa Juritica------");
		super.cadastrar();
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite o CNPJ: ");
		cnpj = tec.nextLine();	
	}
	
	@Override
	public void imprime() {
		System.out.println("Pessoa Juritica");
		super.imprime();
		System.out.println("CNPJ: " + cnpj);
	}

}
