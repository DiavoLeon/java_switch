package Exercícios;

import java.util.Scanner;

public class Exercício {
	
	public static void main(String[] args) {
	float x, y, z;
	int escolhaDeCalculo;
	
	Scanner leitor = new Scanner (System.in);
	
	System.out.println("Digite a primeira nota: ");
	x = leitor.nextFloat();
	
	System.out.println("Digite a segunda nota: ");
	y = leitor.nextFloat();
			
	System.out.println("Digite a terceira nota: ");
	z = leitor.nextFloat();
	
	System.out.println("Por qual método você deseja calcular as notas? ");
	
	System.out.println("Digite 1 para Média Aritmética");
	
	System.out.println("Digite 2 para Média Ponderada");
	
	escolhaDeCalculo = leitor.nextInt();
	
	switch(escolhaDeCalculo){
		case 1:
			System.out.println((x + y + z)/3);
		break;
		
		case 2:
			System.out.println(((x * 3) + (y *3) + (z *4)) /10);
		break;
		
	default:
		System.out.println("Opção Inválida");
		break;
	}
	}
}
