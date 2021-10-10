package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.println("Taxa: ");
		funcionario.imposto = sc.nextDouble();
		
		
		System.out.println(
				"Nome: " + funcionario.nome + ", " +
				"Salario Bruto: " + funcionario.SalarioLiquido()
		);
		
		System.out.println("Digite a taxa de acrescimo: ");
		double taxaParaAcrescentar = sc.nextDouble();
		funcionario.acrescentaSalario(taxaParaAcrescentar);
		
		System.out.print("Update data: ");
		System.out.println(
				"Nome: " + funcionario.nome + ", " +
				"Salario Bruto: " + funcionario.salarioBruto
		);		
		
		sc.close();
	}

}
