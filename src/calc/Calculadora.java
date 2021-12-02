package calc;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserte numero: ");
		int num1 = s.nextInt();
		System.out.println("Numero: ");
		int num2 = s.nextInt();
		
		
		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
	}

}
