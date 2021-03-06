package course;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as dimensções do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as dimensções do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = x.area();
		
		System.out.printf("Triangulo X: %.4f%n", areaX);
		System.out.printf("Triangulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area é: X");
		}else {
			System.out.println("Maior area é: Y");
		}
		
		sc.close();

	}

}
