package course;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original  = "ajshs JHGSSGJAG  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		
		System.out.println("Orignal: " + original);
		System.out.println("toLoweCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("strim: " + s03);
	}
}
