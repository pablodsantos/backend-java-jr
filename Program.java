package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product Data");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantiade no stock: ");
		product.quantity = sc.nextInt();
		
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();

		System.out.println("Digite a quantidade de produtos: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Update Product data: " + product);
		System.out.println();
		
		sc.close();
	}

}
