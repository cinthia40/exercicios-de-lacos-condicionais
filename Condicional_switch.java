package lacos_condicionais;

import java.util.Scanner;

public class Condicional_switch {

	public static void main(String[] args) {
		
		float numero1,numero2;
		int operacao;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		System.out.println("Selecione a operação matemática: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1: System.out.println("O resultado é: "+(numero1+numero2));
		break; 
		case 2: System.out.println("O resultado é: "+(numero1-numero2));
		break;
		case 3: System.out.println("O resultado é: "+(numero1*numero2));
		break;
		case 4: System.out.println("O resultado é: "+(numero1/numero2));
		break;
		}
		
		

	}

}
