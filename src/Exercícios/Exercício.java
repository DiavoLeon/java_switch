package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio {
	
	public static void main(String[] agrs) {
		String x;

		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o C�digo do Produto: ");
		
		x = leitor.next();
		
		switch(x) {
		
		case "001":
			System.out.println("Parafuso");
			break;
			
		case "002":
			System.out.println("Porca");
			break;
			
		case "003":
			System.out.println("Prego");
			break;
			
		case "004":
			System.out.println("Ferramenta");
			break;
			
		default:
			System.out.println("Diversos");
		}
	}
	
}

	
	
	

