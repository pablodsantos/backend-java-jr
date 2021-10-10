package entities;

public class Conta {
	private String nome;
	private double saldo;
	private int numeroConta;
	
	public Conta() {
		
	}
	
	public Conta(String nome, double saldo, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		deposito(saldo);
	}
	
	public Conta(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {	
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	
	public void retirada(double saldo) {
		this.saldo -= saldo;
		this.saldo -= 5.0;
	}
	
	public String toString() {
		return "DATA BANK" 
		+ " | Nome do titular da conta: " + nome
		+ " | Numero da conta: " + numeroConta
		+ " | Saldo em conta: " + saldo;	
	}
}
