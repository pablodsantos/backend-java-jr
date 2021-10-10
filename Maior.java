package course;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite três numeros inteiros: ");
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		showResult(max(a,b,c));
		
		sc.close();
	}
	
	public static int max(int x,int y,int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
	
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("O maior valor digitado foi: " + value);
	}
	
}
