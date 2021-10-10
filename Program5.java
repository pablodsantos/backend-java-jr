package application;

import java.util.Locale;
import java.util.Scanner;

import util.Converter;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do dolar: ");
		double dolar = sc.nextDouble();
		System.out.println("Quantidade a comprar em reais: ");
		double valorComprar = sc.nextDouble();
		
		System.out.printf("Valor a pagar: %.2f\n", Converter.ValorEmDolar(dolar, valorComprar));
		
		sc.close();
	}
}
