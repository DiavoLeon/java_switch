package Exercícios;

import java.util.Scanner;

public class Exercício {


public static void main(String[] args) {
	String x;
	int y;
	float z = 0;
	
	Scanner leitor = new Scanner (System.in);
	
	System.out.println("Digite o Código do Produto: ");
	
	x = leitor.next();
	
	System.out.println("Digite a Quantidade do Produto");
	
	y = leitor.nextInt();
	
	switch(x) {
	
		case "100":
			System.out.println("Cachorro Quente");
			z = 3.20f;
			
		break;
		
		case "101":
			System.out.println("Bauru Simples");
			z = 4.30f;
		break;
		
		case "102":
			System.out.print("Bauru com ovo");
			z = 5.50f;
		break;
		
		case "103":
			System.out.println("Hambúrguer");
			z = 3.20f;
		break;
		
		case "104":
			System.out.println("Cheeseburguer");
			z = 4.30f;
		break;
		
		case "105":
			System.out.println("Refrigerante");
			z = 4.00f;
		break;
					
		}
	System.out.println(z * y);
	
	
}

}