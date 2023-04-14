package lacos_condicionais;

import java.util.Scanner;

public class Condicional_switch2 {

	public static void main(String[] args) {
		String nome;
		int codigo;
		float salario,novosalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.printf("\nDigite o número do cargo correspondente: ");
		System.out.println("\n1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		codigo = leia.nextInt();
		System.out.printf("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
		case 1: System.out.println("Nome: "+nome+"\nCargo: Gerente\nSalário: "+(novosalario = salario + (0.10f * salario)));
		break;
		case 2: System.out.println("Nome: "+nome+"\nCargo: Vendedor\nSalário: "+(novosalario = salario + (0.7f * salario)));
		break;
		case 3: System.out.println("Nome: "+nome+"\nCargo: Supervisor\nSalário: "+(novosalario = salario + (0.9f * salario)));
		break;
		case 4: System.out.println("Nome: "+nome+"\nCargo: Motorista\nSalário: "+(novosalario = salario + (0.6f * salario)));
		break;
		case 5: System.out.println("Nome: "+nome+"\nCargo: Estoquista\nSalário: "+(novosalario = salario + (0.5f * salario)));
		break;
		case 6: System.out.println("Nome: "+nome+"\nCargo: Técnico de TI\nSalário: "+(novosalario = salario + (0.8f * salario)));
		break;
		}
	
        
		
	}

}
