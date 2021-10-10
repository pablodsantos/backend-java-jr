package entities;

public class Aluno {
	public String name;
	public double p1;
	public double p2;
	public double p3;
	
	public double NotaFinal() {
		return p1 + p2 + p3;
	}
	
	public String Resultado() {
		if(NotaFinal() >= 60.0) {
			return "PASS";
		}else {
			return "FAILED";
		}
	}
}
