package conta;

import cliente.Pessoa;

@SuppressWarnings("unused")
public class ContaBancaria {
	
	private float saldo;
	private int numeroConta;
	private String titular;
	private int tipoConta;
	
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

}
