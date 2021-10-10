package util;

public class Calculator {
	
	public static final double PI = 3.14159;
	
	public static double circunferencia(double raio) {
		return raio * PI * 2;
	}
	
	public static double volume(double raio) {
		return Math.pow(raio, 3) * 4.00 * PI / 3.00;
	}
}
