package entities;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
	    retangulo.altura = sc.nextDouble();
	    
	    System.out.println("Digite a largura do retangulo: ");
	    retangulo.largura = sc.nextDouble();
	    
	    System.out.println("Area: " + retangulo.Area());
	    System.out.println("Diagonal: " + retangulo.Diagonal());
	    System.out.println("Perimetro: " + retangulo.Perimetro());
		sc.close();	
	}

}
