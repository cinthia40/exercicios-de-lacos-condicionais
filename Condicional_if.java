package lacos_condicionais;

import java.util.Scanner;

public class Condicional_if {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = leia.nextInt();
		
		if (a+b>c) {
			
			System.out.println("A soma de A+B é maior do que C.");
		}
		
		else if (a+b<c) {
		System.out.println("A soma de A+B é menor do que C.");
		}
		
		else {
			System.out.println("A soma de A+B é igual a C.");
		}

	}

}
