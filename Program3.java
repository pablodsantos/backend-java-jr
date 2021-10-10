package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do aluno: ");		
		aluno.name = sc.next();
		
		System.out.println("Digite as três notas de " + aluno.name + ": ");
		aluno.p1 = sc.nextDouble();
		aluno.p2 = sc.nextDouble();
		aluno.p3 = sc.nextDouble();
		
		System.out.println("Notal final: " + aluno.NotaFinal() + " Status: " + aluno.Resultado());
		
		if(aluno.Resultado() == "FAILED") {
			System.out.println("Points to PASS: " + (60.0 - aluno.NotaFinal()));
		}
		
		sc.close();
	}
}
