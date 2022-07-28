package caixa;

import java.util.Scanner;

import cliente.Pessoa;
import cliente.PessoaFisica;
import cliente.PessoaJuridica;

public class CaixaEletronico {
	
	static Pessoa pessoa[] = new Pessoa[10];
	public static int ultimo = 0;
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 4) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Cadastrar Pessoa Física");
			System.out.println("2 - Cadastrar Pessoa Juridica");
			System.out.println("3 - Imprimir Clientes");
			System.out.println("4 - Sair");
			opcao = tec.nextInt();
			tec.nextLine();
			
			switch(opcao) {
			case 1: pessoa[ultimo] = new PessoaFisica(); break;
			case 2: pessoa[ultimo] = new PessoaJuridica(); break;
			case 3: imprime(); break;
			case 4: System.out.println("Saindo do sistema"); break;
			default: System.out.println("Valor Inválido"); break;
			
			}
			
			if(opcao == 1) {
				pessoa[ultimo].cadastrar();
				ultimo++;
			}else if(opcao == 2) {
				pessoa[ultimo].cadastrar();
				ultimo++;
				
			}
		}
		
		
	}

	private static void imprime() {
		for(int i = 0; i <= ultimo; i++) {
			pessoa[i].imprime();
		}
		
		
	}

}
