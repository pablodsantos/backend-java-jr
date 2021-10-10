package util;

public class Converter {
	public static double ValorEmDolar(double real, double quantidade) {
		double valorEmDolar = real * quantidade;
		return valorEmDolar += (valorEmDolar * 0.06);	
	}
}
