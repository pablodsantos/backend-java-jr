package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		
		System.out.printf("Perimetro: %.2f\n", Calculator.circunferencia(raio));
		System.out.printf("Volume: %.2f\n", Calculator.volume(raio));
		System.out.printf("PI: %.2f\n", Calculator.PI);
		
		sc.close();
	}
}
