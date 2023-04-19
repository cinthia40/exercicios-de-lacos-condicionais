package lacos_condicionais;

import java.util.Scanner;

public class Condicional_if3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean x = true;
		
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		x = leia.nextBoolean();
		
		
		if (x == true && idade>=60) {
			System.out.println(nome+" não está apto para doar sangue!");
		}
		
		else if (idade>=18 && idade<=69) {
			System.out.println(nome+" está apto para doar sangue!");
		}
		
		else {
			System.out.println(nome+" não está apto para doar sangue!");
		}
		
		
		
	}

}
