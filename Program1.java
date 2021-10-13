package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtc;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Tamanho do vetor: ");
		int num = sc.nextInt();
		
		Produtc[] vect = new Produtc[num];
		
		for(int i=0; i< vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produtc(name,price);
		}
		
		imprimeVetor(vect);
		System.out.println("Media dos valores: " + media(vect));
		
		sc.close();
	}
	
	private static void imprimeVetor(Produtc[] vetor) {
		for(int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i].getName());
			System.out.println(vetor[i].getPrice());
		}
	}
	
	private static double media(Produtc[] vetor) {
		double soma = 0.0;
		
		for(int i=0; i < vetor.length; i++) {
			soma += vetor[i].getPrice();
		}
		return soma / vetor.length;
	}
}
