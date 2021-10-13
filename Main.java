package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Valor %d: ", (i + 1));			
			vect[i]  = sc.nextDouble();
		}

		imprimeVetor(vect);
		
		sc.close();
	}

	private static void imprimeVetor(double[] vetor) {
		System.out.println("Vetor armazenado: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.2f\t", vetor[i]);
		}
	}
}
