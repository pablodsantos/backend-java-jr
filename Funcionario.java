package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double SalarioLiquido() {
		return (salarioBruto - imposto);
	}
	
	public void acrescentaSalario(double imposto) {
		salarioBruto += ((salarioBruto * imposto) / 100);
	}
}
