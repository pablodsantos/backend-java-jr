package application;

import java.util.Scanner;

import entities.Estudante;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroMaximoDeQuartos = 10;
		Estudante[] estudantes = new Estudante[numeroMaximoDeQuartos];
		
		System.out.println("Disponiveis[10] - Numero de quartos:");
		int quantidadeDeQuartos = sc.nextInt();
		
		for(int i=0; i<quantidadeDeQuartos; i++) {
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			int numeroQuarto;
			do {
				System.out.println("Numero do quarto: ");
				numeroQuarto = sc.nextInt();
			}while(numeroQuarto > numeroMaximoDeQuartos);
						
			estudantes[numeroQuarto] = new Estudante(nome,email);
		}
		
		imprimeVetorDeAlunos(estudantes, numeroMaximoDeQuartos);
		sc.close();
	}
	
	private static void imprimeVetorDeAlunos(Estudante[] estudantes, int numeroMaximoDeQuartos) {
		for(int i=0; i<numeroMaximoDeQuartos; i++) {
			if(estudantes[i] != null) {
				System.out.println("Nome: " + estudantes[i].getName()
				+ " | E-mail: " + estudantes[i].getEmail()
				+ " | Numero do quarto: " + i);
			}
		}
	}
}
