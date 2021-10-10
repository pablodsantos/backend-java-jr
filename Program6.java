package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do titular da conta: ");
		String nome = sc.next();
		System.out.println("Numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Saldo inicial: ");
		double saldo = sc.nextDouble();
		
		Conta conta = new Conta(nome, saldo, numeroConta);
		
		System.out.println(conta.toString());
		
		System.out.println("Deposito em conta: ");
		saldo = sc.nextDouble();
		conta.deposito(saldo);
		
		System.out.println(conta.toString());
		
		System.out.println("Retirada em conta: ");
		saldo = sc.nextDouble();
		conta.retirada(saldo);

		System.out.println(conta.toString());
		
		sc.close();
	}

}
